package ex_01_Java_Basics;
import java.util.Scanner;

public class Inverted_Right_Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = scan.nextInt();

        for(int i=1; i<=n; i++ ){
           for(int j=i; j<=n; j++){
               System.out.print("* ");
           }
            System.out.println("");
        }
    }
}
