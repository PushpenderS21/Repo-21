package feb3;

class Employee {
    int panCardNumber;
    String name;
    int age;

    public Employee(int panCardNumber, String name, int age) {
        this.panCardNumber = panCardNumber;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return panCardNumber + " " + name + " " + age;
    }
}

public class ImmutableDemo {
    public static void main(String args[]) {
        Employee e = new Employee(123456, "rahul", 25);
        // String s1 = e.getPancardNumber();
        System.out.println(e.toString());
    }
}

