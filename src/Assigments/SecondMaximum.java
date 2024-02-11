package Assigments;

import java.util.Scanner;

public class SecondMaximum {
    public static void main(String[] args) {

        System.out.println("Enter the array elements");
        int[] arr1 = new int[8];
        int temp;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[j] < arr1[i]) {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;


                }
            }


        }
        System.out.println(arr1[arr1.length - 2]);


    }
}