package jan7;

import java.util.Scanner;

public class calculatorDemo {
    public static void main(String[] args) {
       /* System.out.println("Welcome to my calculator");
        System.out.println("Choose from the following options");
        System.out.println("1.Addtion");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5. Modulus");
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int choice;

        System.out.println("Enter First number");
        num1 = scanner.nextInt();
        System.out.println("Enter Second number");
        num2 = scanner.nextInt();
        System.out.println("Enter your choice");
        choice = scanner.nextInt();


        if (choice==1){
            int sum =num1+num2;
            System.out.println("The sum is :"+ sum);
        }
        else if (choice==2) {
            int sub = num1-num2;
            System.out.println("The subtraction is:" + sub);

        }
        else if (choice==3) {
            int product =num1*num2;
            System.out.println("The multiplication is:"+ product);

        } else if (choice==4) {
            int div =num1/num2;
            System.out.println("The division is: " +div);

        }
        else if(choice==5){
            int mod=num1%num2;
            System.out.println("The modulus is :"+ mod);
        }
        else{
            System.out.println("Invalid selection");
        }
*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("Choose from the following options");
        System.out.println("1.Addtion");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5. Modulus");
        double num1;
        double num2;
        int choice;

        System.out.println("Enter First number");
        num1 = scanner.nextInt();
        System.out.println("Enter Second number");
        num2 = scanner.nextInt();
        System.out.println("Enter your choice");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double add = num1 + num2;
                System.out.println(add);
                break;
            case 2:
                double sub = num1 - num2;
                System.out.println(sub);
                break;
            case 3:
                double prod = num1 * num2;
                System.out.println(prod);
                break;
            case 4:
                double div = num1 / num2;
                System.out.println(div);
                break;

            case 5:
                double mod = num1% num2;
                System.out.println(mod);
                break;
            default:
                System.out.println("invalid entry");
        }
    }
}
