package feb20;

public class TestClass {
    String model;
    int price;


    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        TestClass testClass2 = new TestClass();
        testClass.model = "lenovo";
        testClass2.model = "lenovo";
        testClass.price = 1000;
        testClass2.price = 1000;
        System.out.println(testClass == testClass2);
        System.out.println(testClass.equals(testClass2));


    }

}