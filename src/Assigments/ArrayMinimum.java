package Assigments;

public class ArrayMinimum {
    public static void main(String[] args) {
        int[] arr = {10, 30, 43, 54, 23, 543, 43, 32};
        int arrMin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arrMin > arr[i]) {
                arrMin = arr[i];
            }


        }
        System.out.println(arrMin);
    }
}
