package jan10;

import java.util.Scanner;

public class IvrPrcatice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Welcome to rogers customer service");
        System.out.println("Press 1 for English or Press 2 for french");
        int choice;
        choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Please sleect from the following options");
            System.out.println("1.Mobile");
            System.out.println("2.TV");
            System.out.println("3 Internet");
            int choice2;
            choice2=scanner.nextInt();
            if (choice2==1|| choice2==2 ||choice2==3)
            {
                System.out.println("Please chose form the following options");
                System.out.println("1.Tech support");
                System.out.println("2.Billing");
                System.out.println("3.exit");
            }
            else
            {
                System.out.println("Invalid input");
            }

        }
        else if(choice==2) {
            System.out.println("Welcome to french support");
        }*/
        System.out.println("Welcome to rogers customer service");
        System.out.println("Press 1 for English or Press 2 for french");
        int choice;
        int choice2;
        int choice3;
        choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("welcome to english support");
                System.out.println("Select from the following options");
                System.out.println("Press 1 for mobile");
                System.out.println("Press 2 for  TV");
                System.out.println("Press 3 for Internet");
                System.out.println("Press 4 for exit");
                choice2 = scanner.nextInt();

                switch (choice2) {
                    case 1:
                        System.out.println("welcome to mobile support");
                        System.out.println("Select from th following options");
                        System.out.println("Press 1 Tech support");
                        System.out.println("Press 2 Billing");
                        System.out.println("Press 3 to exit");
                        choice3 = scanner.nextInt();
                        switch (choice3) {
                            case 1:
                                System.out.println("welcome to tech support you would be connected with a live agent shortly");
                                break;
                            case 2:
                                System.out.println("welcome to Billing you would be connected with a live agent shortly");
                                break;

                            case 3:
                                System.out.println("Thank you for contacting!!");
                                break;
                            default:
                                System.out.println("invalid input try again");

                        }

                        break;
                    case 2:
                        System.out.println("welcome to tv support");
                        System.out.println("Select from the following options");
                        System.out.println("Press 1 for Tech support");
                        System.out.println("Press 2 for billing");
                        System.out.println("Press 3 for exit");
                        choice3 = scanner.nextInt();

                        switch (choice3) {
                            case 1:
                                System.out.println("welcome to tech support you would be connected with a live agent shortly");
                                break;
                            case 2:
                                System.out.println("welcome to Billing you would be connected with a live agent shortly");
                                break;
                            case 3:
                                System.out.println("Thank you for contacting!!");
                                break;
                            default:
                                System.out.println("invalid input try again");
                        }
                        break;
                    case 3:
                        System.out.println("welcome to Internet support");
                        System.out.println("Select from th following options");
                        System.out.println("Press 1 Tech support");
                        System.out.println("Press 2 Billing");
                        System.out.println("Press 3 to exit");
                        choice3 = scanner.nextInt();
                        switch (choice3) {
                            case 1:
                                System.out.println("welcome to tech support you would be connected with a live agent shortly");
                                break;
                            case 2:
                                System.out.println("welcome to Billing you would be connected with a live agent shortly");
                                break;

                            case 3:
                                System.out.println("Thank you for contacting!!");
                                break;
                            default:
                                System.out.println("invalid input try again");

                                break;
                        }
                    case 4:
                        System.out.println("Thank you for contacting suppor have a nice dayt");
                        break;
                    default:
                        System.out.println("invalid input try again");
                }
            }
            case 2 -> System.out.println("welcome to french support");

            default -> System.out.println("Invalid input");
        }
    }
}