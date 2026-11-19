public class CircularQueue {
    private final int[] q = new int[5]; private int front = -1, rear = -1;
    void enqueue(int v) {
        if ((rear + 1) % q.length == front) { System.out.println("Queue is full"); return; }
        if (front == -1) front = 0; rear = (rear + 1) % q.length; q[rear] = v;
    }
    int dequeue() {
        if (front == -1) { System.out.println("Queue is empty"); return -1; }
        int v = q[front]; if (front == rear) front = rear = -1; else front = (front + 1) % q.length;
        return v;
    }
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(); q.enqueue(11); q.enqueue(22); q.enqueue(33);
        System.out.println(q.dequeue()); System.out.println(q.dequeue());
    }
}
