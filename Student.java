package Inheritance;

public class Student extends User {
    private String name = "Justin";
    private int age = 21;

    public Student(String userName, String password, String name, int age) {
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
        System.out.println("\u001B[33m" + "Student message sent" + "\u001B[0m");
    }

    public void point() {
        System.out.println("\u001B[35m" + "Student's point -> (85/100)" + "\u001B[0m");
    }
}
