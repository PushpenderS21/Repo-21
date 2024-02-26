package feb12;

import java.util.Scanner;

public class insertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("enter the number you want to insert in the array");
        int n = scanner.nextInt();
        System.out.println("enter the index at which u want to insert the number in the array");
        int index = scanner.nextInt();
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (index == i) {
                temp = arr[i];
                arr[i] = n;
                arr[i + 1] = temp;

            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
