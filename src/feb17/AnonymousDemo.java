package feb17;


import java.util.Scanner;

public class AnonymousDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Anonymous anonymous = new Anonymous() {
            @Override
            public void sayHi() {
                System.out.println("hi");
            }
        };
        anonymous.sayHi();

    }
}