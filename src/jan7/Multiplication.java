package jan7;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n;
        n= scanner.nextInt();
       int product;
       int sum=0;
        for (int i =1; i<=10; i++){
            product=n*i;
            sum +=product;
        }
        System.out.println(sum);


    }
}

