class DSU {
    int N;
    int[] parent, rank, size;
    DSU(int n) {
        N = n;
        parent = new int[N];
        rank = new int[N];
        size = new int[N];
        for (int i = 0; i < N; i++) {
            parent[i] = i;
            rank[i] = 1;
            size[i] = 1;
        }
    }
    int find(int v) { // average time O(inverse Ackermann function, basically constant)
        if (parent[v] == v) return v;
        return parent[v] = find(parent[v]);
    }
    void union(int a, int b) { // average time same as find()
        a = find(a); b = find(b);
        if (a == b) return;
        if (rank[a] < rank[b])  {
            parent[a] = b;
            size[b] += size[a];
        }
        else {
            parent[b] = a;
            size[a] += size[b];
            if (rank[a] == rank[b]) rank[a]++;
        }
    }
}
