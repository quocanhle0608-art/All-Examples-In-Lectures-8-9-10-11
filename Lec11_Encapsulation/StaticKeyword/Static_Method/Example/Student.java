package Encapsulation.StaticKeyword.Static_Method.Example;

public class Student {

    int rollon;
    String name;
    static String college = "DTU";

    static void change() {
        college = "BBDIT";
    }

    Student(int r, String n) {
        rollon = r;
        name = n;
    }

    void display() {
        System.out.println(rollon + " " + name + " " + college);
    }

    public static void main(String args[]) {
        Student.change();

        Student s1 = new Student(111, "Trang");
        Student s2 = new Student(222, "Duong");

        s1.display();
        s2.display();
    }
}
