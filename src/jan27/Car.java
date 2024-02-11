package jan27;

public class Car {
    public static void carDetails() {
        System.out.println("car details");
    }

    static {
        System.out.println("inside static block");
    }

    public void run() {
        System.out.println("car run");
    }

    {
        System.out.println("instance block");
    }
}
