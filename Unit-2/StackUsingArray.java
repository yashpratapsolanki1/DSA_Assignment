public class StackUsingArray {
    private final int[] stack = new int[5]; private int top = -1;
    void push(int v) { if (top == stack.length - 1) { System.out.println("Stack Overflow"); return; } stack[++top] = v; }
    int pop() { if (top == -1) { System.out.println("Stack Underflow"); return -1; } return stack[top--]; }
    void display() { for (int i = top; i >= 0; i--) System.out.println(stack[i]); }
    public static void main(String[] args) {
        StackUsingArray s = new StackUsingArray(); s.push(10); s.push(20); s.push(30);
        System.out.println("Popped: " + s.pop()); s.display();
    }
}
