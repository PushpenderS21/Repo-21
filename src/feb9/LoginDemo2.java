package feb9;

public class LoginDemo2 {
    private String userName;
    private String password;

    public LoginDemo2(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    public String getUserName() {
        return userName;
    }


    public String getPassword() {
        return password;
    }


    public void login(String userName, String password) {
        if (userName.equalsIgnoreCase(this.userName) && password.equalsIgnoreCase(this.password)) {
            System.out.println("login Successfull : Welcome to the app");
        } else {
            System.out.println("Invalid credentials");
        }
    }
}