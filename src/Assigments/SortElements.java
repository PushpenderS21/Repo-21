package Assigments;

import java.util.Arrays;

public class SortElements {
    public static void main(String[] args) {
        int[] arr = {10, 30, 43, 54, 23, 543, 43, 32};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
