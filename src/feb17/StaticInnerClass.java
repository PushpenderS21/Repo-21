package feb17;

class Outer {
    static int x = 40;

    static class Inner {//static inner class

        void msg() {//non static method
            System.out.println(x);
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();// instance created to access non static method of the static inner class
        obj.msg();
    }

}
