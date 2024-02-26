package feb20;

import java.util.Scanner;

public class DuplicateNumber {
    public static void main(String[] args) throws DuplicateNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers you want to enter");
        int x = scanner.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter the Numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        try {
            Duplicate.duplicateNum(arr);
        } catch (DuplicateNumberException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Thanks for using the app");
    }
}

