package PTIT_CNTT4_IT203_SESSION9.ex3;

public class ex3 {
    public static void main(String[] args) {
        Manager m = new Manager("Tran Van B", 15000000, "IT");
        m.display();
    }
}
class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void display() {
        System.out.println("Ten: " + name);
        System.out.println("Luong co ban: " + baseSalary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, double baseSalary, String department) {
        super(name, baseSalary);
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Phong ban: " + department);
    }
}