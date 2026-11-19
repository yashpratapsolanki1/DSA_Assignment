import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {12, 7, 25, 9, 18};
        System.out.print("Enter value to search: ");
        int key = sc.nextInt(), position = -1;
        for (int i = 0; i < a.length; i++) if (a[i] == key) { position = i; break; }
        System.out.println(position == -1 ? "Element not found" : "Element found at index " + position);
        sc.close();
    }
}
