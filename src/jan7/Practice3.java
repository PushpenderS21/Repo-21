package jan7;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String day;
        System.out.println("Enter the day");
        day= scanner.nextLine();

        if(day.equalsIgnoreCase("monday")||day.equalsIgnoreCase("tuesday")||day.equalsIgnoreCase("wednesday")||day.equalsIgnoreCase("thursday")||day.equalsIgnoreCase("friday")) {
            System.out.println("ticket is 10$");
        }

        else if (day.equalsIgnoreCase("saturday")){
            System.out.println("Ticket is 15$");
        }
        else if(day.equalsIgnoreCase("sunday")){
            System.out.println("ticket is 12$");
        }
        else {
            System.out.println("Enter a a valid day");
        }

    }
}
