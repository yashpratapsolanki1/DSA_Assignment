public class BinaryTreeTraversals {
    static class Node { int data; Node left, right; Node(int d) { data = d; } }
    static void preorder(Node n) { if (n == null) return; System.out.print(n.data + " "); preorder(n.left); preorder(n.right); }
    static void inorder(Node n) { if (n == null) return; inorder(n.left); System.out.print(n.data + " "); inorder(n.right); }
    static void postorder(Node n) { if (n == null) return; postorder(n.left); postorder(n.right); System.out.print(n.data + " "); }
    public static void main(String[] args) {
        Node root = new Node(1); root.left = new Node(2); root.right = new Node(3);
        root.left.left = new Node(4); root.left.right = new Node(5);
        System.out.print("Preorder: "); preorder(root); System.out.print("\nInorder: "); inorder(root);
        System.out.print("\nPostorder: "); postorder(root);
    }
}
