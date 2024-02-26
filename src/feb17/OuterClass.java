package feb17;

public class OuterClass {
    class InnerClass {
        public void greet() {
            System.out.println("good morning");
        }

    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.greet();
    }
}
