package jan30;

interface Animal {
    void eat();

    void sleep();

    void drinkWater();

}

abstract class Monkey {
    abstract public void jump();

    abstract public void bite();
}

class Human extends Monkey implements Animal {
    public void jump() {
        System.out.println("Humans are capable of jumping");
    }

    public void bite() {
        System.out.println("Human has teeth to bite or chew food");
    }

    public void eat() {
        System.out.println("Humans are omnivourous");
    }

    public void sleep() {
        System.out.println("sleeping......");
    }

    public void drinkWater() {
        System.out.println("drinking......");
    }
}

public class BasicAnimal {
    public static void main(String[] args) {
        Animal animal = new Human();
        animal.eat();
        animal.drinkWater(); /// "Polymorphism----- a reference of Animal interface is created but it is using object of the class thus
        //animal is  using methods which is defined in human class but present only in Animal interface, thus
        //polymorphism allows using methods of human clas as animal methods.
    }
}
