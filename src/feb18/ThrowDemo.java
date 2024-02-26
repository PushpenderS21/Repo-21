package feb18;

import java.util.Scanner;

public class ThrowDemo {
    public static void age(int age) throws ArithmeticException {
        if (age <= 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("You can vote");

        }


    }

    public static void main(String[] args) {
        try {
            System.out.println("Enter your age");
            Scanner scanner = new Scanner(System.in);

            int x = scanner.nextInt();
            ThrowDemo.age(x);
        } catch (ArithmeticException e) {
            System.out.println("not eligible");
        }
        
    }
}

