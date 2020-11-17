class node {
    int data;
    node left;
    node right;
    node(int d) {
        data = d;
        left = null;
        right = null;
    }
    void insert(int val) {
        if (val < data && left == null) left = new node(val);
        else if (val >= data && right == null) right = new node(val);
        else if (val < data) left.insert(val);
        else right.insert(val);
    }

    public boolean equals(node o) {
        if (((left == null) != (o.left == null)) || ((right == null) != (o.right == null))) return false;
        boolean leftcomp = true;
        if (left != null) leftcomp = left.equals(o.left);
        boolean rightcomp = true;
        if (right != null) rightcomp = right.equals(o.right);
        return leftcomp && rightcomp;
    }
}
