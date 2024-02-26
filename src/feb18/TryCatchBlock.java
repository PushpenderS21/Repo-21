package feb18;

import java.util.Scanner;

public class TryCatchBlock {
    public static void main(String[] args) {
        int[] a = {10, 24, 35};
        int ind;
        int number;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            System.out.println("Enter the index of the  number you want to divide");
            ind = scanner.nextInt();
            System.out.println("Enter the number yo want to divide with");
            number = scanner.nextInt();
            try {
                System.out.println("The number at the index is " + a[ind]);
                System.out.println("Result: " + a[ind] / number);
                flag = false;
            } catch (ArithmeticException e) {
                System.out.println("invalid division");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("cannot find the  number at specified index");
                System.out.println("Enter a valid index");
            }
        }
        System.out.println("Thank you for using our services");
    }
}
