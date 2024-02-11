package jan27;

public class Family {
    String firstName;
    static String lastName = "Singh";
    int age;

    /* public Family(String x, int z) {
      this.firstName = x;
     this.age = z;


    }
*/
    public void familyDetails(String firstName, int age) {

        System.out.println("my name is " + firstName + " " + lastName + " I am " + age + " years old");
    }
}
