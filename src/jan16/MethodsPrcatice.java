package jan16;

public class MethodsPrcatice {
    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n + 1; j >= i + 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }


}

