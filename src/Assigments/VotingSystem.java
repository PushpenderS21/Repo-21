package Assigments;

import java.util.Scanner;

public class VotingSystem {
    public static void main(String[] args) throws InvalidAgeException {
        int age;
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.out.println("Please enter you age");
        age = scanner.nextInt();
        do {
            try {
                Voter.setAge(age);
                System.out.println("You can choose from the following option");
                System.out.println("Press 1 for Liberal Party");
                System.out.println("Press 2 for Conservatives Party");
                System.out.println("Press 3 for Other");
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2 || choice == 3) {
                    System.out.println("Vote casted successfully");
                } else {
                    System.out.println("Invalid Selection");

                }
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }

        } while (choice > 3 || choice == 0);
    }


}

