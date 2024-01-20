package jan7;

import javax.swing.*;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*System.out.println("enter the first number");
        double x=scanner.nextDouble();
        System.out.println("Enter the second number");
                double y= scanner.nextDouble();
        double div = x/y;
        System.out.println("result: "+div);*

        System.out.println("Enter you age");
        int age;
        age = scanner.nextInt();
        if (age>0 && age <= 13) {
            System.out.println("infant");


        else if ((age > 13 && age <= 19)) {
            System.out.println("teenager");
        }

       else if (age > 19 && age <=60) {
            System.out.println("adult");
        }

        else if (age > 60&& age<=100) {
            System.out.println("senior citizen");
        }

    else {
            System.out.println("Not a humnan");
        }

        System.out.println("Enter the first number");
        int x=scanner.nextInt();
        System.out.println("Engter the second number");
        int y=scanner.nextInt();
        System.out.println("Eneter the third number");
        int z =scanner.nextInt();
        if (x>y&&x>z){
            System.out.println(x+" is greatest");
        }
            else if (y>x&&y>z){
                System.out.println(y +" is greatest");

            }
            else {
            System.out.println(z+" is greatest");
        }*/
        System.out.println("Enter the marks");
        int marks =scanner.nextInt();
        if (marks>=90){
            System.out.println("Your grade is A");
        }
        else if (marks<90 && marks>=80){
            System.out.println("Your grade is B");
        }
        else if (marks<80&&marks>=70) {
            System.out.println("Your garde is C");
        }
        else if (marks<70 && marks>=60){
            System.out.println("Your garde is D");
            
        }
        else if (marks<60 && marks>=0) {
            System.out.println("Your garde is F");
            
        }
        else {
            System.out.println("Enter valid marks");

        }


    }
}
