package PTIT_CNTT4_IT203_SESSION9.ex1;

public class ex1 {
    public static void main(String[] args) {
        Student st = new Student("Nguyen Van A", 20, "SV001", 8.5);
        st.display();
    }
}
class Person {
    protected String fullName;
    protected int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void display() {
        System.out.println("Ho ten: " + fullName);
        System.out.println("Tuoi: " + age);
    }
}

class Student extends Person {
    private String studentId;
    private double gpa;

    public Student(String fullName, int age, String studentId, double gpa) {
        super(fullName, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Ma sinh vien: " + studentId);
        System.out.println("Diem trung binh: " + gpa);
    }
}