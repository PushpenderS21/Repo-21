package jan7;

import java.util.Locale;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        /*int day;
        System.out.println("Enter number to find the day of the week");
        day=scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("Its Monday");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;
            case 5:
                System.out.println("Its Friday");
                break;
            case 6:
                System.out.println("Its Saturday");
                break;
            case 7:
                System.out.println("Its Sunday");
                break;
            default:
                System.out.println("Invalid number");
                System.out.println("try again with a number between 1-7");

        }*/

        char grade;
        System.out.println("Enter the grade");
        grade=scanner.next().toUpperCase(Locale.ROOT).charAt(0);
        switch (grade){
            case 'A' :
                System.out.println("EXCELLENT");
                break;
            case 'B' :
                System.out.println("GOOD");
                break;
            case 'C' :
                System.out.println("SATISFACTORY");
                break;
            case 'D':
                System.out.println("BAD");
                break;
            case 'E':
                System.out.println("FAIL");
                break;
            default:
                System.out.println("invalid grade");




        }
    }
}
