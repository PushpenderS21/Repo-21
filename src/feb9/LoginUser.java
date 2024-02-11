package feb9;

public class LoginUser {
    public static void main(String[] args) {
        LoginDemo login1 = new LoginDemo("rohan", "rohan@123");
        LoginDemo2 login2 = new LoginDemo2("rohan", "rohan@123");
        LoginDemo3 login3 = new LoginDemo3("rohan", "rohan@123");
        login1.login("rohan", "rohan@123");
        login2.login("rohan", "rohan@123");
        System.out.println(login2.getPassword());
    }

}
