package Inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================");
        Student student = new Student("admin", "1234", "Justin", 21);
        Teacher teacher = new Teacher("admin", "123s4", "Mike", 38);
        System.out.println(student.getName() + " " + student.getAge());
        System.out.println(teacher.getName() + " " + teacher.getAge());
        teacher.point();
        student.point();
        student.sendMessage();
        teacher.sendMessage();
        System.out.println("==================================");
    }
}
