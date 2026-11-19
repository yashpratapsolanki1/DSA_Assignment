public class SinglyLinkedList {
    static class Node { int data; Node next; Node(int d) { data = d; } }
    Node head;
    void insertAtEnd(int value) {
        Node node = new Node(value);
        if (head == null) { head = node; return; }
        Node current = head;
        while (current.next != null) current = current.next;
        current.next = node;
    }
    void display() {
        Node current = head;
        while (current != null) { System.out.print(current.data + " -> "); current = current.next; }
        System.out.println("null");
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(10); list.insertAtEnd(20); list.insertAtEnd(30); list.display();
    }
}
