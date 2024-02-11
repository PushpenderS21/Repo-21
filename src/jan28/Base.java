package jan28;


abstract class Parent {
    // public Parent() {
    // System.out.println("its a constructor");
    //

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();

}

abstract class Child extends Parent {
    public void myName() {
        System.out.println("My name is P");
    }

    abstract public void age();

}

class child2 extends Child {
    public void greet() {
        System.out.println("good afternoon");

    }

    public void age() {
        System.out.println("My age is 24");
    }

    public void name() {
        System.out.println("my name is Pushpender");
    }
}

public class Base {
    public static void main(String[] args) {
        child2 child = new child2();
        child.sayHello();
        child.greet();
        child.name();
        child.age();
        Parent parent = new child2();
        parent.greet();
    }

}


/*
abstract class Parent {
    String name;
    int age;

    abstract public void greet();

    public void MyName(String name) {
        this.name = name;
        System.out.println("My name is " + name);
    }
}

class Child extends Parent {
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    public void age(int age) {
        this.age = age;
        System.out.println("I am " + age + " years old");
    }
}

public class Base {

    public static void main(String[] args) {
        Child child = new Child();
        child.greet();
        child.MyName("Karan");
        child.age(24);


    }
}
*/
