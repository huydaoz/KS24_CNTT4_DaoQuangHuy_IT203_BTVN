package PTIT_CNTT4_IT203_SESSION9.ex5;
import java.util.ArrayList;
import java.util.List;

public class ex5 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new OfficeEmployee("Nguyen Van A", 10_000_000));
        employees.add(new ProductionEmployee("Tran Thi B", 300, 20_000));
        employees.add(new ProductionEmployee("Le Van C", 150, 30_000));

        double totalSalary = 0;

        System.out.println("Danh sach luong nhan vien:");
        int index = 1;

        for (Employee e : employees) {
            double salary = e.calculateSalary();
            totalSalary += salary;
            System.out.println(index + ". " + e.getName() + " - Luong: " + salary);
            index++;
        }

        System.out.println("=> TONG LUONG CONG TY: " + totalSalary);
    }
}

abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    public String getName() {
        return name;
    }
}

class OfficeEmployee extends Employee {
    private double baseSalary;

    public OfficeEmployee(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}

class ProductionEmployee extends Employee {
    private int numOfProducts;
    private double price;

    public ProductionEmployee(String name, int numOfProducts, double price) {
        super(name);
        this.numOfProducts = numOfProducts;
        this.price = price;
    }

    @Override
    public double calculateSalary() {
        return numOfProducts * price;
    }
}