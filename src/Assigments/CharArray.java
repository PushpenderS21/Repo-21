package Assigments;

import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        char[] letters = new char[5];
        System.out.println("enter the characters");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < letters.length; i++) {
            letters[i] = scanner.next().charAt(1);

        }
        for (char ch : letters) {
            System.out.println(ch);
        }
    }
}