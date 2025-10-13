package ex_01_Java_Basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Evenoroddnumber_Terinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        String result = (num%2 == 0) ? "Even number" : "Odd number";
        System.out.println(result);

    }
}
