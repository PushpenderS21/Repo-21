package jan30;

import java.util.Scanner;

public class conditionalPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1;
        int input2;
        int input3;
        System.out.println("enter first number");
        input1 = scanner.nextInt();
        System.out.println("enter second  number");
        input2 = scanner.nextInt();
        System.out.println("enter Third number");
        input3 = scanner.nextInt();
        if (input1 > input2 && input1 > input3 && input2 > input3) {
            System.out.println("Decreasing order");
        } else if (input3 > input2 && input2 > input1) {
            System.out.println("increasing order");

        } else {
            System.out.println("neither increasing nor decreasing");
        }


    }
}