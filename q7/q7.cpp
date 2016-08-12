#include <cstdio>
#include <cstring>

using namespace std;

char w[5002][102];
int first[5000][26];
int last[5000][26];
int cumsum[5000][26][102];

int main() {
    int N,M;
    scanf("%d %d",&N,&M);
    
    memset(first,-1,sizeof(first));
    memset(last,-1,sizeof(last));
    memset(cumsum,0,sizeof(cumsum));
    
    for (int i = 0; i < N; ++i) {
        scanf("%s",w[i]);
        
        int k;
        for (k=0; w[i][k]; ++k)
            last[i][w[i][k]-'a'] = k;
        for (--k; k >= 0; --k)
            first[i][w[i][k]-'a'] = k;
        for (int j = 0; j < 26; ++j) {
            for (int k = 0; w[i][k]; ++k) {
                cumsum[i][j][k+1] = cumsum[i][j][k] + (w[i][k]-'a'==j);
            }
        }
    }
    
    char plate[5];
    for (int i = 0; i < M; ++i) {
        scanf("%s",plate);
        
        bool succ = false;
        for (int j = 0; j < N; j++) {
            if (first[j][plate[0]-'A'] != -1 && last[j][plate[2]-'A'] != -1
                && cumsum[j][plate[1]-'A'][first[j][plate[0]-'A']+1] <
                cumsum[j][plate[1]-'A'][last[j][plate[2]-'A']]) {
                printf("%s\n", w[j]);
                succ = true;
                break;
            }
        }
        if (!success)
            printf("No valid word\n");
    }
}




