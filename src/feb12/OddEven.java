package feb12;

public class OddEven {
    public static void main(String[] args) {
        int[] arr = {11, 24, 31, 48, 1, 5, 6, 4,};
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }

        }
        System.out.println("The number of even integers is : " + countEven);
        System.out.println("The number of odd integers is : " + countOdd);
    }
}