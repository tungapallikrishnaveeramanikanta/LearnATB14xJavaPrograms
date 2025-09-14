package ex_01_Java_Basics;
import java.util.Scanner;


public class Test_Class_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a table No : ");
        int table = scan.nextInt(); //9
        System.out.print("Enter a Limit: ");
        int n = scan.nextInt();  //12
        for(int i=1;i<=n;i++) {
            System.out.println(table + " x " + i  + " = "  + (table * i));
        }

    }
}

