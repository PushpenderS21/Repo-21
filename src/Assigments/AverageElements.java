package Assigments;

import java.util.Scanner;

public class AverageElements {
    public static void main(String[] args) {
        System.out.println("Enter the array elements");
        int[] arr1 = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += i;

        }
        double average = sum / arr1.length;
        System.out.println("The average is : " + average);

    }
}
