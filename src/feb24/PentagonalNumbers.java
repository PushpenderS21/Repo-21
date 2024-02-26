package feb24;

public class PentagonalNumbers {
    public static int pentagonal(int i) {

        return (i - 1) * i + i * (i + 1) / 2;
    }
}

class printPentagonal {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            System.out.println(PentagonalNumbers.pentagonal(i));

        }
    }
}