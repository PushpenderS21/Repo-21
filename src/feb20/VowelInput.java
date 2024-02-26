package feb20;

import java.util.Scanner;

public class VowelInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        try {
            String s;
            s = scanner.next();
            ContainsVowels.Vowels(s);
        } catch (VowelException e) {
            System.out.println(e.getMessage());
        }
    }
}