package feb9;

class MyEmployee {
    int Id;
    String name;
    Address address;

    public MyEmployee(int id, String name, Address address) {
        this.Id = id;
        this.name = name;
        this.address = address;
    }

    public void showInfo() {
        System.out.println("Employee ID " + Id);
        System.out.println("Employee name " + name);
        System.out.println("Employee Address : " + address);

    }
}

public class Employee {
    public static void main(String[] args) {
//Address address = new Address(12, "Cambridge", "Canada", "n1r5g7");
        MyEmployee employee = new MyEmployee(123456, "Rahul", new Address(12, "Cambridge", "Canada", "n1r5g7"));
        employee.showInfo();
    }
}
