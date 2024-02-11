package Assigments;

import java.util.Locale;
import java.util.Scanner;

public class LengthOfSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        System.out.println("Enter the word ");
        word = scanner.next().toLowerCase(Locale.ROOT);
        char[] newWord = word.toCharArray();
        int count = 0;
        for (int i = 0; i < newWord.length; i++) {
            for (int j = i + 1; j < newWord.length - 1; j++) {
                if (newWord[i] == newWord[j]) {
                    count++;
                }


            }

        }
        System.out.println("length of longest substring without repetition: " + (newWord.length - count));


    }
}



