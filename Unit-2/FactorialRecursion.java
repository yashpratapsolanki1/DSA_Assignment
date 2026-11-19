import java.util.Scanner;
public class FactorialRecursion {
    static long factorial(int n) { if (n <= 1) return 1; return n * factorial(n - 1); }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); System.out.print("Enter a non-negative integer (0-20): ");
        int n = sc.nextInt();
        if (n < 0 || n > 20) System.out.println("Enter a value from 0 to 20.");
        else System.out.println("Factorial = " + factorial(n));
        sc.close();
    }
}
