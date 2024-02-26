package feb17;

class Outer2 {
    static int x = 40;

    static class Inner {//static inner class

        static void msg() {// static method
            System.out.println(x);
        }
    }
}


public class StaticInnerDemo {
    public static void main(String[] args) {
        Outer2.Inner.msg(); // can be accessed without the instance as inner static class have static method
    }
}
