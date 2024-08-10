package Inheritance;

public class User {
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        if (userName.equals("admin") && password.equals("1234")) {
            System.out.println("\u001B[32m" + "Login successful." + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Login failed." + "\u001B[0m");
        }
    }

    public void sendMessage() {
        System.out.println("Message sent.");
    }
}
