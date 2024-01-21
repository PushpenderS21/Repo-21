public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = 1123456;
        student.firstname = "Pushpender";
        student.lastname = "Singh";
        student.email = "pushpendersingh562@gmail.com";
        student.eat();
        student.sleep();
        student.study();
        System.out.println(student.firstname);

    }


}
