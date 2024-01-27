package jan23;

import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {
    int randomNumber;
    int maxAttempts = 10;

    public guessTheNumber() {
        Random random = new Random();
        randomNumber = random.nextInt(100);
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess number between 0 and 99");
        while (true) {
            int input = scanner.nextInt();
            if (input == randomNumber) {
                System.out.println("congratulations you guessed it right");
                break;
            } else if (input < randomNumber) {
                System.out.println("your guess is less");

            } else {
                System.out.println("your guess is more");
            }
        }
    }


    public static void main(String[] args) {
        guessTheNumber number = new guessTheNumber();
        number.playGame();

    }


}

