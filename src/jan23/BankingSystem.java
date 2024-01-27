package jan23;

import java.util.Scanner;

class BankAccount {
    double balance;
    int accountNumber;

    BankAccount() {
        balance = 10000;
        accountNumber = 5588994;

    }

    public void Deposit(int x) {
        balance += x;
    }

    public void Withdraw(int x) {

        balance -= x;

    }

}


public class BankingSystem {

    public static void main(String[] args) {
        int n;
        do {
            System.out.println("***Hello to our banking system");
            System.out.println("Choose form the following options");
            System.out.println("1.Check balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdrawal");
            System.out.println("4.Exit");
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            BankAccount account = new BankAccount();
            switch (userInput) {
                case 1:
                    System.out.println("Your balance is " + account.balance);
                    break;
                case 2:
                    System.out.println("Please enter the amount you want to deposit");
                    int deposit = scanner.nextInt();
                    account.Deposit(deposit);
                    System.out.println("You have successfully deposited the amount the new balance is " + account.balance);
                    break;
                case 3:
                    System.out.println("Please enter the amount you want to withdraw");
                    int withdraw = scanner.nextInt();
                    if (withdraw <= account.balance) {
                        account.Withdraw(withdraw);
                        System.out.println("You have successfully withdrawn the amount the new balance is " + account.balance);
                    } else {
                        System.out.println("Insufficient funds");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using our baning services");
                    break;
                default:
                    System.out.println("Please select a valid option");
                    break;

            }
            System.out.println("Press 1 to continue or 2 to exit");
            n = scanner.nextInt();

        } while (n == 1);


    }


}
