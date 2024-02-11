package Assigments;

import java.util.Locale;
import java.util.Scanner;

public class ReverseOrderOfWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        System.out.println("Enter the sentence ");
        word = scanner.nextLine().toLowerCase(Locale.ROOT);
        String[] sentence = word.split("\\s");
        String temp;
        int i = 0;
        int j = sentence.length - 1;
        while (i < j) {
            temp = sentence[i];
            sentence[i] = sentence[j];
            sentence[j] = temp;
            i++;
            j--;

        }
        for (int k = 0; k < sentence.length; k++) {
            System.out.print(sentence[k]);
            System.out.print(" ");

        }

    }
}
