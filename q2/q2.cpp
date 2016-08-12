#include <cstdio>
#include <cstdlib>
#include <utility>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

typedef pair<int, int> pp;

int main() {
    int n;
    scanf("%d", &n);

    vector<pp> m;

    while(n--) {
        int L, U;
        scanf("%d %d", &L, &U);

        pp a = make_pair(L, U);
        m.push_back(a);
    }

	sort(m.begin(), m.end());

    int counter = 1;
    int thres = m.at(0).second;

    for (int i=0; i<m.size(); ++i){
        if (m.at(i).first<=thres){
            if (m.at(i).second<=thres){
                thres = m.at(i).second;
            }
            continue;
        }
        counter++;
        thres = m.at(i).second;
    }

    printf("%d", counter);

    return 0;
}