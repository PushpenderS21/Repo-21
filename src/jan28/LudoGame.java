package jan28;

import java.util.Random;

public class LudoGame {
    int userInput;
    int randomNumber;

    public LudoGame() {
        int[] possibleOutcomes = {1, 2, 3, 4, 5, 6};
        Random random = new Random();
        randomNumber = random.nextInt(possibleOutcomes.length);

    }

    public void playGame() {


        switch (randomNumber) {
            case 1:
                System.out.println("Move 1 step");
                break;
            case 2:
                System.out.println("Move 2 steps");
                break;
            case 3:
                System.out.println("Move 3 steps");
                break;
            case 4:
                System.out.println("Move 4 steps");
                break;
            case 5:
                System.out.println("Move 5 steps");
                break;
            case 6:
                System.out.println("Move 6 step");
                break;
            default:
                System.out.println();

        }


    }

    public static void main(String[] args) {
        LudoGame game = new LudoGame();
        game.playGame();

    }

}
