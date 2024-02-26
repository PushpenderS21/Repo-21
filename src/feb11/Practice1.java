package feb11;

class Sum {
    public int add(int a, int b) {
        return 5;

    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

}

public class Practice1 {
    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println(sum.add(2, 3));
    }

}
