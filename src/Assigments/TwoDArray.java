package Assigments;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int rows = arr1.length;
        int cols = arr2.length;
        int[][] sum = new int[rows][cols];
        arr1[0][0] = 54;
        arr1[0][1] = 12;
        arr1[0][2] = 4;
        arr1[1][0] = 2;
        arr1[1][1] = 36;
        arr1[1][2] = 40;
        arr1[2][0] = 6;
        arr1[2][1] = 5;
        arr1[2][2] = 4;

        arr2[0][0] = 2;
        arr2[0][1] = 9;
        arr2[0][2] = 40;
        arr2[1][0] = 5;
        arr2[1][1] = 3;
        arr2[1][2] = 6;
        arr2[2][0] = 3;
        arr2[2][1] = 5;
        arr2[2][2] = 12;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];

            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.println(sum[i][j]);
            }

        }
    }

}



