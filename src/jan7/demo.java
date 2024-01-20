package jan7;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
                int num;
System.out.println("Enter a number");
        for ( int i=1;i<=100;i++) {
            num=scanner.nextInt();
            if (num % 5 == 0) {
                System.out.println("5 points");
                continue;
            }
            else if (num % 7 == 0) {
                System.out.println("7 points");
                continue;
            } else if (num == 6) {
                System.out.println("you won 100 million");
                break;
            }
        }


    }
}
