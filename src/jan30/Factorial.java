package jan30;

public class Factorial {

    public int sum(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;

        } else {
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        Factorial sum1 = new Factorial();
        System.out.println(sum1.sum(10));
    }
    /*public int CalculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;


        } else {
            return n * CalculateFactorial(n - 1);
        }

    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        factorial.CalculateFactorial(5);
        System.out.println(factorial.CalculateFactorial(5));
    }*/
}
