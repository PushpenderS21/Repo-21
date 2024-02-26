package feb15;

abstract class Phone {
    public abstract void call();
}

abstract class MobilePhone extends Phone {
    public abstract void cordless();

}

abstract class SmartPhone extends MobilePhone {
    public abstract void internetFeature();

}

class AIphone extends SmartPhone {
    public void call() {
        System.out.println("calling.....");
    }

    public void cordless() {
        System.out.println("roam freely with no cords");

    }

    public void internetFeature() {
        System.out.println("Internet on the palm of ur hands");

    }

    public void generatePicture() {
        System.out.println("now u can take ultra hd picture");
    }

}

public class AbstracttDemo {
    public static void main(String[] args) {
        AIphone aIphone = new AIphone();
        aIphone.call();
        aIphone.cordless();
        aIphone.internetFeature();
        aIphone.generatePicture();

    }
}
