package jan7;

public class TestDataType {
    public static void main(String[] args) {
        int x = 15;
        float tax = 15.46f;
        double z = 7899.3;
        boolean isSnowing = true;
        char ch = 'P';
        System.out.println(x);
        System.out.println(tax);
        System.out.println(z);
        System.out.println(isSnowing);
        System.out.println(ch);


    }

    public static class FibonacciSeries {
        static int series(int n) {

            if (n == 1) {
                return 0;
            } else if (n == 2) {
                return 1;

            } else {
                return series(n - 1) + series(n - 2);
            }
        }

        public static void main(String[] args) {
            System.out.println(series(5));

        }
    }
}
