package jan16;

public class Methods {
    /*  static  int sum(int...arr){
          int result=0;
          for (int a:arr){
          result +=a;
      }
          return result;*/
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);

        }


    }


    public static void main(String[] args) {
        int n = 4;
        System.out.println(factorial(n));

    }
}
