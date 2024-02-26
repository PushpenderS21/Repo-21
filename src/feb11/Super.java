package feb11;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hello");
    }

    public void language() {
        System.out.println("language you speak");

    }
}

class john extends Person {
    String hobby;

    public john(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;


    }

    public void hobby() {
        System.out.println("I love cricket");
    }


    public void language() {
        System.out.println("I speak english");
    }

    public void drive() {
        super.language();
        System.out.println(" I can drive");
    }
}


public class Super {
    public static void main(String[] args) {
        john johnathan = new john("kane williamson", 25, "cricket");
        johnathan.language();
        System.out.println(johnathan.hobby);
        johnathan.drive();
    }
}
