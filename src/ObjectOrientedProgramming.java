/*class Employee{
    int id;
    String name;
    int salary;
    String newName;
    public void printDetails(){
        System.out.println("Employee name is "+ name);
        System.out.println("Employee ID "+ id);
    }
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;

    }
    public String setName(){
        name=newName;
        return name;
    }

}*/

class cellPhone{
    String ringing;
    String vibrating;

public void ringMode() {
    System.out.println("Phone is ringing");
}

    public void silentMode() {
        System.out.println("Phone is silent");
    }

}

public class ObjectOrientedProgramming {
    public static void main(String[] args) {
       cellPhone cellphone= new cellPhone();
      cellphone.ringMode();
      cellphone.silentMode();
    }
}
/* Employee Pushpender = new Employee();
        Pushpender.id=789456;
        Pushpender.name="Pushpender singh";
        Pushpender.salary=40000;
        Pushpender.printDetails();
       int salary= Pushpender.getSalary();
        System.out.println("Salary is "+salary);
       String name= Pushpender.getName();
        System.out.println(name);
        Pushpender.newName="Rajesh";
        String newName= Pushpender.setName();
        System.out.println(newName);*/