package feb9;

public class LoginDemo3 {
    private String userName;
    private String password;

    public LoginDemo3(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login(String userName, String password) {
        if (userName.equalsIgnoreCase(this.userName) && password.equalsIgnoreCase(this.password)) {
            System.out.println("login Successfull : Welcome to the app");
        } else {
            System.out.println("Invalid credentials");
        }
    }
}