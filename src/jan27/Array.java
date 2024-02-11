package jan27;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the fruits");
        String[] fruits = new String[5];
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = scanner.next();

        }
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }


    }
}
