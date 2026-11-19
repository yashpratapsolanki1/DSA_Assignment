import java.util.Stack;
public class InfixToPostfix {
    static int precedence(char c) { if (c == '^') return 3; if (c == '*' || c == '/') return 2; if (c == '+' || c == '-') return 1; return 0; }
    static String convert(String exp) {
        StringBuilder out = new StringBuilder(); Stack<Character> ops = new Stack<>();
        for (char c : exp.replaceAll("\\s+", "").toCharArray()) {
            if (Character.isLetterOrDigit(c)) out.append(c);
            else if (c == '(') ops.push(c);
            else if (c == ')') { while (!ops.isEmpty() && ops.peek() != '(') out.append(ops.pop()); if (!ops.isEmpty()) ops.pop(); }
            else {
                while (!ops.isEmpty() && ops.peek() != '(' && (precedence(ops.peek()) > precedence(c) ||
                    (precedence(ops.peek()) == precedence(c) && c != '^'))) out.append(ops.pop());
                ops.push(c);
            }
        }
        while (!ops.isEmpty()) out.append(ops.pop());
        return out.toString();
    }
    public static void main(String[] args) { String e = "A+B*(C-D)"; System.out.println("Infix: " + e); System.out.println("Postfix: " + convert(e)); }
}
