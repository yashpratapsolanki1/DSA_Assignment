import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        if (n <= 0) { System.out.println("Size must be positive."); sc.close(); return; }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int sum = 0, max = a[0], min = a[0];
        for (int x : a) { sum += x; if (x > max) max = x; if (x < min) min = x; }
        System.out.println("Array: " + Arrays.toString(a));
        System.out.println("Sum = " + sum);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        sc.close();
    }
}
