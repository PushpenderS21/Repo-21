package Assigments;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        System.out.println("Enter the word ");
        word = scanner.next().toLowerCase(Locale.ROOT);
        char[] newWord = word.toCharArray();
        char temp;
        int i = 0;
        int j = newWord.length - 1;
        while (i < j) {
            temp = newWord[i];
            newWord[i] = newWord[j];
            newWord[j] = temp;
            i++;
            j--;
        }
        String word2 = String.valueOf(newWord);


        if (word.equals(word2)) {
            System.out.println("it is a palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}


