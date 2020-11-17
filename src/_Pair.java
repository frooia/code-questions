class pair implements Comparable<pair> {
    int k, v;
    pair(int k, int v) {
        this.k = k;
        this.v = v;
    }
    @Override
    public int compareTo(pair o) {
        if (this.k != o.k)
            return this.k - o.k;
        return this.v - o.v;
    }
    public String toString() {
        return "("+k+", "+v+")";
    }
}