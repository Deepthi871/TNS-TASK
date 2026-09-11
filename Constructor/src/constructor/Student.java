package constructor;

public class Student {
    String name;
    int rollNo;

    Student() {
        name = "Deepthi";
        rollNo = 1;
        System.out.println("Default Constructor Called");
    }

    Student(String n, int r) {
        name = n;
        rollNo = r;
        System.out.println("Parameterized Constructor Called");
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();

        Student s2 = new Student("Riya", 2);
        s2.display();
    }
}