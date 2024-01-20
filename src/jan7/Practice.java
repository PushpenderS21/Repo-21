package jan7;


import java.util.Random;
import java.util.Scanner;

        public class Practice {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();
                String[] choices = {"rock", "paper", "scissor"};
                String computerChoices = choices[random.nextInt(3)];

                System.out.println("Let's play the game");
                System.out.println("Enter either rock, paper, or scissor");
                String userinput = scanner.nextLine();
                System.out.println(computerChoices);

                if (userinput.equals(computerChoices)) {
                    System.out.println("It's a tie");
                }
                else {
                    System.out.println("you lose");
                }

            }
        }



