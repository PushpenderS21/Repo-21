package feb12;

import java.util.Scanner;

public class RemoveArrayElement {
    public static void main(String[] args) {
        System.out.println("Enter the array elements");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("enter the number you want to remove form array");
        int n = scanner.nextInt();
        int temp;
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (n != arr[j]) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;

            }
        }


        for (int j = 0; j < arr.length - 1; j++) {
            System.out.println(arr[j]);

        }


    }
}

