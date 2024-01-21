import java.util.Scanner;

public class calculatordemo {
    public static void main(String[] args) {
        int n;
        do {
            System.out.println("****Welocme to my calculator***");
            System.out.println("Choose form thr following options");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            Calculator calculator = new Calculator();
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You cam add up to four numbers , how many numbers you want to add");
                    int choice2 = scanner.nextInt();
                    switch (choice2) {

                        case 2:
                            System.out.println("enter the numbers");
                            int num1 = scanner.nextInt();
                            int num2 = scanner.nextInt();
                            System.out.println(calculator.sum(num1, num2));
                            break;
                        case 3:
                            System.out.println("enter the numbers");
                            num1 = scanner.nextInt();
                            num2 = scanner.nextInt();
                            int num3 = scanner.nextInt();
                            System.out.println(calculator.sum(num1, num2, num3));
                            break;
                        case 4:
                            System.out.println("enter the numbers");
                            num1 = scanner.nextInt();
                            num2 = scanner.nextInt();
                            num3 = scanner.nextInt();
                            int num4 = scanner.nextInt();
                            System.out.println(calculator.sum(num1, num2, num3, num4));
                            break;
                        default:
                            System.out.println("invalid entry");

                    }
                    break;

                case 2:
                    System.out.println("You cam subtract up to four numbers , how many numbers you want to subtract");
                    choice2 = scanner.nextInt();
                    switch (choice2) {

                        case 2:
                            System.out.println("enter the numbers");
                            int num1 = scanner.nextInt();
                            int num2 = scanner.nextInt();
                            System.out.println(calculator.subtraction(num1, num2));
                            break;
                        case 3:
                            System.out.println("enter the numbers");
                            num1 = scanner.nextInt();
                            num2 = scanner.nextInt();
                            int num3 = scanner.nextInt();
                            System.out.println(calculator.subtraction(num1, num2, num3));
                            break;
                        case 4:
                            System.out.println("enter the numbers");
                            num1 = scanner.nextInt();
                            num2 = scanner.nextInt();
                            num3 = scanner.nextInt();
                            int num4 = scanner.nextInt();
                            System.out.println(calculator.subtraction(num1, num2, num3, num4));
                            break;
                        default:
                            System.out.println("invalid choice");
                            break;

                    }
                    break;
                case 3:
                    System.out.println("You cam multiply up to four numbers , how many numbers you want to mutiply");
                    choice2 = scanner.nextInt();
                    switch (choice2) {

                        case 2:
                            System.out.println("enter the numbers");
                            int num1 = scanner.nextInt();
                            int num2 = scanner.nextInt();
                            System.out.println(calculator.multiplication(num1, num2));
                            break;
                        case 3:
                            System.out.println("enter the numbers");
                            num1 = scanner.nextInt();
                            num2 = scanner.nextInt();
                            int num3 = scanner.nextInt();
                            System.out.println(calculator.multiplication(num1, num2, num3));
                            break;
                        case 4:
                            System.out.println("enter the numbers");
                            num1 = scanner.nextInt();
                            num2 = scanner.nextInt();
                            num3 = scanner.nextInt();
                            int num4 = scanner.nextInt();
                            System.out.println(calculator.multiplication(num1, num2, num3, num4));
                            break;
                        default:
                            System.out.println("invalid choice");
                            break;

                    }
                    break;

                case 4:
                    System.out.println("You cam divide two numbers ,enter the numbers");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    System.out.println(calculator.divide(num1, num2));
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
            System.out.println("do you want to continue press 1 for yes and 2 for no");
            n = scanner.nextInt();
            if (n == 2) {
                System.out.println("thanks for using calculator");
            } else {
                System.out.println("enter a valid number");
                n = scanner.nextInt();
                
            }

        } while (n == 1);


    }

}
