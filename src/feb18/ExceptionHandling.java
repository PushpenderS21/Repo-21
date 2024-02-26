package feb18;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter you age");
            int x = scanner.nextInt();
            System.out.println("Hello  you are " + x + " years old, Nice to meet you!!");
        } catch (Exception e) {
//          System.out.println("OHH!! please enter your age");
            System.out.println(e);
        } finally {
            scanner.close();
            System.out.println("job done");
        }
        System.out.println("thanks");

    }

}