package ex_01_Java_Basics;
import java.util.Scanner;

public class Maxnumber_Terinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number (n1): ");
        int n1 = scan.nextInt(); //9

        System.out.print("Enter second number (n2): ");
        int n2 = scan.nextInt(); //5

        System.out.print("Enter third number (n3): ");
        int n3 = scan.nextInt(); //2

        // Nested ternary to find maximum
        int max = (n1 > n2) ? ((n1 > n3) ? n1 : n3)
                : ((n2 > n3) ? n2 : n3);

        System.out.println("Maximum number is: " + max);
    }
}
