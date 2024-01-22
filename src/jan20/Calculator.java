package jan20;

public class Calculator {


    public int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;

    }

    public int sum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }

    public int sum(int num1, int num2, int num3, int num4) {
        int addition = num1 + num2 + num3 + num4;
        return addition;
    }

    public int subtraction(int x, int y) {
        return x - y;

    }

    public int subtraction(int x, int y, int z) {
        return x - y - z;
    }


    public int subtraction(int x, int y, int z, int a) {
        return x - y - z - a;
    }

    public int multiplication(int x, int y) {
        return x * y;

    }

    public int multiplication(int x, int y, int z) {
        return x * y * z;
    }

    public int multiplication(int x, int y, int z, int a) {
        return x * y * z * a;
    }

    public int divide(int x, int y) {
        return x / y;
    }

}

