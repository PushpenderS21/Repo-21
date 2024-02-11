package Assigments;

public class ArrayMaximum {
    public static void main(String[] args) {
        int[] arr = {10, 30, 43, 54, 23, 543, 43, 32};
        int maxNum = 0;
        for (int element : arr) {
            if (element > maxNum) {
                maxNum = element;
            }

        }
        System.out.println(maxNum);
    }
}

