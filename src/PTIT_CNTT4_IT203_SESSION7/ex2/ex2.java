package PTIT_CNTT4_IT203_SESSION7.ex2;

public class ex2 {

    static class Student {
        String name;

        Student(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        int a = 10;
        int b = a;

        b = 20;

        System.out.println("Primitive:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println();

        Student s1 = new Student("An");
        Student s2 = s1;

        s2.name = "Binh";

        System.out.println("Reference:");
        System.out.println("s1.name = " + s1.name);
        System.out.println("s2.name = " + s2.name);
    }
}
