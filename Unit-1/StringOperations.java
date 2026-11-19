import java.util.Scanner;
public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("Length: " + s.length());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Reversed: " + reversed);
        System.out.println("Palindrome: " + s.equalsIgnoreCase(reversed));
        sc.close();
    }
}
