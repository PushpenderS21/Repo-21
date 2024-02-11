package Assigments;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int temp;
        System.out.println("Enter the array number");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);

        }
    }

}


