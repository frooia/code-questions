class DSU {
    int[] sizes, parent, rank;
    DSU (int length) {
        sizes = new int[length]; parent = new int[length]; rank = new int[length];
        for (int i = 0; i < length; i++) { parent[i] = i; sizes[i] = 1; rank[i] = 1; }
    }
    int find(int x) {
        if (parent[x] == x) { return x; }
        else { parent[x] = find(parent[x]); }
        return parent[x];
    }
    void union(int a, int b) {
        int aRoot = find(a); int bRoot = find(b);
        if (aRoot == bRoot) { return; }
        if (rank[aRoot] > rank[bRoot]) {
            parent[bRoot] = aRoot;
            sizes[aRoot] += sizes[bRoot];
        }
        else if (rank[aRoot] < rank[bRoot]) {
            parent[aRoot] = bRoot;
            sizes[bRoot] += sizes[aRoot];
        }
        else {
            parent[aRoot] = bRoot;
            sizes[bRoot] += sizes[aRoot];
            rank[bRoot]++;
        }
    }
}