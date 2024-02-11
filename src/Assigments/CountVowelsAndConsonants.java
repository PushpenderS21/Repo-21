package Assigments;

import java.util.Locale;
import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        System.out.println("Enter the word ");
        word = scanner.next().toLowerCase(Locale.ROOT);
        int vowelCount = 0;
        int ConsonantCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;

            } else {
                ConsonantCount++;

            }

        }
        System.out.println("Vowel count= " + vowelCount);
        System.out.println("Consonant count= " + ConsonantCount);
    }

}

