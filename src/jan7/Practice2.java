package jan7;


import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        /*//float[] num={7.9f,8.1f,6.2f,5.8f,1.4f};
        //float sum = 0.0f;
       // sum=num[0]+ num[1]+num[2]+num[3]+num[4];
        for (float value: num){
            sum +=value;
        }
        System.out.println(sum);

*/
        /*int[] num = {5, 45, 9, 63, 4, 74, 55, 7, 2, 1, 56, 9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check ");
        int number = sc.nextInt();

        boolean isNumberinArray = false;
        for (int element : num) {
            if (number == element) {
                isNumberinArray = true;
                break;
            }
        }
        if (isNumberinArray) {
            System.out.println("number is in the array");
        }
        else{
            System.out.println("number is not in the array");
        }

        double[] marksP ={75,85,74,85,75,96,};
                double sum=0.0;
        for (double element :marksP){
            sum +=element;
        }
double avg =sum/5;
        System.out.println("the average of marks is " + avg);


        int[][] matrix1 = {{2, 4, 5}, {6, 7, 8}};
        int[][] matrix2 = {{9, 10, 11}, {12, 13, 14}};
        int[][] result = {{0, 0, 0}, {0, 0, 0}};

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j]= matrix1[i][j]+matrix2[i][j];
                System.out.print(result[i][j] + " ");

            }
            System.out.println();
        }


/*int[][] matrix2 = {{9, 10, 11}, {12, 13, 14}};

            for (int k = 0; k < matrix2.length; k++) {
                for (int l= 0; l < matrix2[k].length; l++) {
                    System.out.print(matrix2[k][l] + " ");

                }
                System.out.println();


            }
            int sum=
        System.out.println(sum);

        int[] matrix = {9, 10, 11, 12, 13, 14};
        for (int i= (matrix.length-1);i>=0;i--){
            System.out.print( matrix[i]+" ");
        }
*/

       /* int[] matrix = {99, 104, 110, 161, 178, 179};
        boolean isSorted =true;
        for (int i=0;i<matrix.length-1;i++) {
            if (matrix[i] > matrix[i + 1]) {
                isSorted = false;
                break;
            }
            }
            if (isSorted) {
                System.out.println("the array is sorted");
            }
            else {
                System.out.println("the array is not sorted " );

            }


        Scanner scanner=new Scanner(System.in);
        int month;
        int year;
        System.out.println("Enter the month number");
        month=scanner.nextInt();
        System.out.println("Enter the year");
        year=scanner.nextInt();
        switch (month) {
            case 1 -> System.out.println("The month is january of " + year + "  and has 31 days ");
            case 2 -> {
                if ((month == 2 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("The month is february of " + year + "  and has 29 days");
                } else {
                    System.out.println("The month is february of " + year + "  and has 28 days");
                }

                break;
            }
            case 3 -> System.out.println("The month is March of   "+year+"  and has 31 days");
            case 4 -> System.out.println("The month is April of " +year+"  and has 30 days");
            case 5 -> System.out.println("The month is May of " + year+ "  and has 31 days");
            case 6 -> System.out.println("The month is june of  "+year+"  and has 30days");
            case 7 -> System.out.println("The month is july of  "+ year+"  and has 31 days");
            case 8 -> System.out.println("The month is august of  "+ year+"  and has 31 days");
            case 9 -> System.out.println("The month is september of  "+ year+"  and has 30 days");
            case 10 -> System.out.println("The month is october of  "+ year+"  and has 31 days");
            case 11 -> System.out.println("The month is november of " + year+"  and has 30 days");
            case 12 -> System.out.println("The month is december of " + year+ " and has 31 days");
            default -> System.out.println("invalid entry");
        }*/

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter any alphabet");
        char alpha;
        alpha=scanner.next().charAt(0);
        if (alpha=='a'||alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u'){
            System.out.println("It's a vowel");
        }
        else{
            System.out.println("Its a consonant");

        }
        }

    }
