package Assigments;

public class PayRollDemo {
    public static void main(String[] args) {
        partTimeEmployee employee1 = new partTimeEmployee(123456, "Emad");
        fullTimeEmployee employee2 = new fullTimeEmployee(654321, "Akbar");
        System.out.println("The name of Employee is " + employee2.name);
        System.out.println("Employee code " + employee2.employeeID);
        System.out.println("The name of Employee is " + employee1.name);
        System.out.println("Employee code " + employee1.employeeID);
        System.out.println("Salary paid to full time employees weekly " + employee2.calculatePay(20, 40));
        System.out.println("Salary paid to part time employees  weekly " + employee1.calculatePay(10, 20));

    }
}

