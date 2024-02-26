package feb24;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordRegex {
    public static void main(String[] args) {
        String password;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you password");
        System.out.println("Password must be least 8 characters long");
        System.out.println("Password must must not contain any special characters");
        System.out.println("Password must must contain atleast  on upper case characters");
        password = scanner.nextLine();
        if (Pattern.matches("[a-zA-z0-9]{8,}", password)) {
            System.out.println("Password created successfully");
        } else {
            System.out.println("Invalid password");
            System.out.println("Try again");
        }
    }


}
