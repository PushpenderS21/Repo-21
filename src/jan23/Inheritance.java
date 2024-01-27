package jan23;

/*class Animal {
    public void eatMeat() {
        System.out.println("eats meat");

    }

    public void colour() {
        System.out.println("can have many colours");
    }
}

class dog extends Animal {
    public void barks() {
        System.out.println("Barking animal");
    }

    public void commonPet() {
        System.out.println("Common pet ");
    }
}

class cat extends dog {
    public void sound() {
        System.out.println("mEOOOWWW");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        dog mydog = new dog();
        cat mycat = new cat();
        mydog.commonPet();
        mydog.barks();
        mycat.sound();
        mycat.colour();
    }
}
*/
/*class Base {
    Base() {
        System.out.println("i am a constructor");
    }

    Base(int x) {
        System.out.println("i am a constructor with value of x :" + x);

    }

    Base(int x, int y) {
        System.out.println("i am a constructor with value of x  :" + x);
        System.out.println("i am a constructor with value of y  :" + y);
    }
}

class Derived extends Base {
    Derived() {
        super(25, 48);
        System.out.println("i am  derived constructor");
    }

    // Derived(int x, int y) {
    // super(x, y);
    //  System.out.println("i am  derived constructor with value of y :" + y);
}


public class Inheritance {
    public static void main(String[] args) {
        //base base1 = new base();
        Derived derived1 = new Derived();*/
class Circle {
    int radius;
    int height;

    public int radius(int x) {
        return radius;

    }

    public double Area() {
        return 3.14 * radius(10) * radius(10);
    }
}

class Cylinder2 extends Circle {
    public int height(int h) {
        return h;
    }


    @Override
    public double Area() {
        return 2 * 3.14 * radius(10) * height(20);
    }

    public double Volume(int a, int b) {
        return 3.14 * a * a * b;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder2 cylinder = new Cylinder2();
        //System.out.println(cylinder.radius(45));
        //System.out.println(cylinder.height(25));
        //System.out.println(cylinder.Volume(10, 20));
        System.out.println(circle.Area());
        System.out.println(cylinder.Area());
    }
}



