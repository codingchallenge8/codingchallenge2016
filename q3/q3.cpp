#include <bits/stdc++.h>
using namespace std;

typedef vector<int> vi;

class UnionFind {                                             
public:
  vi p, rank, setSize;                     
  int numSets;
  UnionFind(int N) {
    setSize.assign(N, 1); numSets = N; rank.assign(N, 0);
    p.assign(N, 0); for (int i = 0; i < N; i++) p[i] = i; }
  int findSet(int i) { return (p[i] == i) ? i : (p[i] = findSet(p[i])); }
  bool isSameSet(int i, int j) { return findSet(i) == findSet(j); }
  void unionSet(int i, int j) { 
    if (!isSameSet(i, j)) { numSets--; 
    int x = findSet(i), y = findSet(j);
    
    if (rank[x] > rank[y]) { p[y] = x; setSize[x] += setSize[y]; }
    else                   { p[x] = y; setSize[y] += setSize[x];
                             if (rank[x] == rank[y]) rank[y]++; } } }
  int numDisjointSets() { return numSets; }
  int sizeOfSet(int i) { return setSize[findSet(i)]; }
};

int main() {
  int N, Q, x, y;
  char ch;
  
  scanf("%d %d\n", &N, &Q);

  UnionFind UF(N);

  for (int i = 0; i < Q; i++) {
    scanf("%c %d %d\n" , &ch, &x, &y);

    if (ch == '?') {
      if (UF.isSameSet(x, y)) {
        printf("yes\n");
      } else {
        printf("no\n");
      }
    } else {
      UF.unionSet(x, y);
    }
  }
  return 0;
}