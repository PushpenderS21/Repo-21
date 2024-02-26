package feb17;

public class OuterDemo {
    static class innerDemo {
        public void test() {
            System.out.println("testing");
        }
    }

    public static void main(String[] args) {
        OuterDemo.innerDemo obj = new OuterDemo.innerDemo();
        obj.test();


    }
}
