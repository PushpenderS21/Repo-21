package Assigments;

import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args) {
        System.out.println("Enter the array elements");
        int[] arr1 = new int[8];
        int temp;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int j = 0; j < arr1.length; j++) {
            for (int k = j + 1; k < arr1.length; k++) {
                if (arr1[j] > arr1[k]) {
                    temp = arr1[j];
                    arr1[j] = arr1[k];
                    arr1[k] = temp;
                }

            }

        }

        System.out.println(arr1[arr1.length - 3]);


    }
}
