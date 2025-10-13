package ex_01_Java_Basics;

public class TypeCasting {
    public static void main(String[] args) {
        byte a =10;
        int b = a; //implicit typecasting

        int c= 300;
        byte d = (byte)c; //explicit typecasting

        System.out.println(b);
        System.out.println(d);

    }

}
