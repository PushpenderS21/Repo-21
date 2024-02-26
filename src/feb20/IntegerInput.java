package feb20;

import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int x;
            System.out.println("Enter any even number");
            x = scanner.nextInt();

            number.getNumber(x);
        } catch (OddNumException e) {
            System.out.println(e.getMessage());
            System.out.println(e);
        }


    }
}
