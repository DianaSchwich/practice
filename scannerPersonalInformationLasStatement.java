package practice;

import java.util.Scanner;

public class scannerPersonalInformationLasStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your name");
        String name= scan.next();

        System.out.println("Enter your age");
        int age= scan.nextInt();

        System.out.println("Enter your mobile number");
        String mobile= scan.next();

        String nn="Wegas";
        String cc="123-465-7890";
        int vv=45;

        System.out.println("Your name is  "+nn+" ,your age is "+vv+" and your mobile number is "+cc+"");


    }
}

