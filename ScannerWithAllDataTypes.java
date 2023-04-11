package practice;

import java.util.Scanner;

public class ScannerWithAllDataTypes {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("what is your name");
        String name=scan.next();

        System.out.println("what is your last name");
        String lastName=scan.next();

        System.out.println("password");
        String password=scan.next();

        System.out.println("congratulation");

        System.out.println("what is your age");
        int age= scan.nextInt();

        System.out.println("Please enter your gender");
        char gender=scan.next().charAt(0);
        System.out.println("you entered" +gender);
    }
}
