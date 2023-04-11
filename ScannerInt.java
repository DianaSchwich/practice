package practice;

import java.util.Scanner;

public class ScannerInt {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age");
        int age= scan.nextInt();


        System.out.println("Your age after 10 years is"+" " +(age+10));

    }
}
