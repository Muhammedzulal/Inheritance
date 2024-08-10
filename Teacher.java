package Inheritance;

public class Teacher extends User {
    private String name = "Mike";
    private int age = 38;

    public Teacher(String userName, String password, String name, int age) {
        super(userName, password);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void sendMessage() {
        System.out.println("\u001B[33m" + "Teacher message sent" + "\u001B[0m");
    }

    public void point() {
        System.out.println("\u001B[35m" + "Teacher's point -> (4.9/5)" + "\u001B[0m");
    }
}
