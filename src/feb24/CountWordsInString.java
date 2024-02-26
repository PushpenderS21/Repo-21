package feb24;

import java.util.Scanner;

public class CountWordsInString {
    public static String count(String s) {
        String[] a = s.split("\\s");

        return "Number of words in the string is: " + (a.length);

    }

}

class CountWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = scanner.nextLine();

        System.out.println(CountWordsInString.count(input));
    }
}