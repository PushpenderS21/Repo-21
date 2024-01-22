import java.util.Scanner;

public class areaDemo {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("**Welcome to the math class***");
            System.out.println("choose from the following options");
            System.out.println("1.Find perimeter of square");
            System.out.println("2.Find area of square");
            System.out.println("3.Find perimeter of rectangle");
            System.out.println("4.Find area of rectangle");
            System.out.println("5.Find perimeter of circle");
            System.out.println("6.Find area of circle");
            int choice = scanner.nextInt();
            Area math = new Area();
            switch (choice) {
                case 1:
                    System.out.println("Enter the side of square");
                    int x = scanner.nextInt();
                    System.out.println("Perimeter of square is " + math.sqaurePerimeter(x));
                    break;

                case 2:
                    System.out.println("Enter the side of square");
                    x = scanner.nextInt();
                    System.out.println("Area of square is " + math.squareArea(x));
                    break;
                case 3:
                    System.out.println("Enter the sides of rectangle");
                    x = scanner.nextInt();
                    int y = scanner.nextInt();
                    System.out.println("Perimeter of rectangle is " + math.rectanglePerimeter(x, y));
                    break;
                case 4:
                    System.out.println("Enter the sides of rectangle");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    System.out.println("Area of rectangle is " + math.rectangleArea(x, y));
                    break;
                case 5:
                    System.out.println("Enter the radius of circle");
                    x = scanner.nextInt();
                    System.out.println("Perimeter of circle is " + math.circlePerimeter(x));
                    break;
                case 6:
                    System.out.println("Enter the radius of circle");
                    x = scanner.nextInt();
                    System.out.println("Area of circle is " + math.circleArea(x));
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("do you want to continue press 1 else press 2");
            n = scanner.nextInt();
            if (n > 2) {
                System.out.println("invalid choice");
            }

        } while (n == 1);
        System.out.println("thanks for your participation");


    }
}
