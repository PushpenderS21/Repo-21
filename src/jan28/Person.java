package jan28;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;


    }

    public void printDetails() {
        System.out.println("My name is " + name + " and my age is " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Pushpender", 25);
        Person person2 = new Person("Rahul", 30);
        person1.printDetails();
        person2.printDetails();


    }
}
