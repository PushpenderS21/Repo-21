package jan7;

import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock", "paper ", "scissor"};
        String computerChoices = choices[(random.nextInt(3))];
        System.out.println("lets play the game");
        System.out.println("Enter either rock, paper or scissor");
        String userinput = scanner.nextLine();
        System.out.println("your input :"+ userinput);
        System.out.println("computer choice :" + computerChoices);

        if (userinput.equals(computerChoices))
        {
            System.out.println("it's a tie");
        }
        else if (userinput.equals("rock")) {
            if (computerChoices.equals("paper")) {
                System.out.println("you loose");
            } else if (computerChoices.equals("scissor")) {
                System.out.println("you win");
            }
        } else if (userinput.equals("paper")) {
            if (computerChoices.equals("rock")) {
                System.out.println("you win");
            } else if (computerChoices.equals("scissor")) {
                System.out.println("you loose");

            }
        } else if (userinput.equals("scissor")) {
            if (computerChoices.equals("paper")) {
                System.out.println("you loose");
            } else if (computerChoices.equals("rock")) {
                System.out.println("you win");

            }

        }
    }
}