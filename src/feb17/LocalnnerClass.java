package feb17;

class LocalDemo {
    private int x = 30;

    public void showX() {
        class Local {
            void msg() {
                System.out.println("The number is : " + x);
            }

        }
        Local local = new Local();
        local.msg();
    }
}

public class LocalnnerClass {
    public static void main(String[] args) {
        LocalDemo localDemo = new LocalDemo();
        localDemo.showX();
    }
}
