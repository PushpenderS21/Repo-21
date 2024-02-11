package Assigments;

class Employee {
    int employeeID;
    String name;

    public Employee(int employeeID, String name) {
        this.employeeID = employeeID;
        this.name = name;
    }

    public double calculatePay(int payRate, int hoursWorked) {
        return 0;
    }
}

class fullTimeEmployee extends Employee {

    public fullTimeEmployee(int employeeID, String name) {
        super(employeeID, name);
    }

    @Override
    public double calculatePay(int payRate, int hoursWorked) {
        return hoursWorked * payRate;
        
    }
}

class partTimeEmployee extends Employee {

    public partTimeEmployee(int employeeID, String name) {
        super(employeeID, name);
    }

    public double calculatePay(int payRate, int hoursWorked) {
        return hoursWorked * payRate;
    }

}