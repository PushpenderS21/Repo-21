package feb9;

public class LoginDemo {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public LoginDemo(String userName, String password) {
        this.userName = userName;
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