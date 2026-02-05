package PTIT_CNTT4_IT203_SESSION9.ex6;
import java.util.ArrayList;
import java.util.List;

public class ex6 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Rectangle(6));

        double totalArea = 0;
        int index = 1;

        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            totalArea += area;

            if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                System.out.println(index + ". Hinh tron (r=" + c.getRadius() + ") - Dien tich: " + area);
            } else if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                if (r.getWidth() == r.getHeight()) {
                    System.out.println(index + ". Hinh vuong (canh " + r.getWidth() + ") - Dien tich: " + area);
                } else {
                    System.out.println(index + ". Hinh chu nhat (" + r.getWidth() + " x " + r.getHeight() + ") - Dien tich: " + area);
                }
            }
            index++;
        }

        System.out.println("=> Tong dien tich cac hinh: " + totalArea);
    }
}


abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double side) {
        this.width = side;
        this.height = side;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}