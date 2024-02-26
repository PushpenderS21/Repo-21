package feb12;

import java.util.Scanner;

public class PairOFElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the specified number");
        n = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
                    System.out.println("Pair of elements is : " + arr[i] + " and " + arr[j] + " , their sum is : " + n);
                }


            }

        }

    }
}
