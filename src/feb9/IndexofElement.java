package feb9;

import java.util.Scanner;

public class IndexofElement {
    public static void main(String[] args) {
        System.out.println("Enter the array number");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();

        }
        System.out.println("Enter the element you want to check the index for");
        int n = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                System.out.println(i);
            }
            if (n != arr[i]) {
                System.out.println("element not found");
                break;
            }


        }

    }
}
