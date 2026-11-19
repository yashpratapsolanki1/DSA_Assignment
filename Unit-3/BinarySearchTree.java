public class BinarySearchTree {
    static class Node { int key; Node left, right; Node(int k) { key = k; } }
    Node root;
    Node insert(Node n, int key) {
        if (n == null) return new Node(key);
        if (key < n.key) n.left = insert(n.left, key); else if (key > n.key) n.right = insert(n.right, key);
        return n;
    }
    void inorder(Node n) { if (n != null) { inorder(n.left); System.out.print(n.key + " "); inorder(n.right); } }
    public static void main(String[] args) {
        BinarySearchTree t = new BinarySearchTree();
        for (int v : new int[]{50,30,70,20,40,60,80}) t.root = t.insert(t.root, v);
        System.out.print("BST inorder: "); t.inorder(t.root);
    }
}
