package feb9;

class Student1 {
    String name;
    Address address;
    String course;

    public Student1(String name, Address address, String course) {
        this.name = name;
        this.course = course;
        this.address = address;
    }

    public void Details() {
        System.out.println(name);
        System.out.println(address);
        System.out.println(course);

    }

}

public class Student {
    public static void main(String[] args) {
        Address address = new Address(12, "Cambridge", "Canada", "MlK701");
        Student1 student1 = new Student1("Rohan", address, "Java");
        System.out.println(student1.address.city);
    }
}


