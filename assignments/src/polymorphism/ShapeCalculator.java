package polymorphism;

import java.util.ArrayList;

public class ShapeCalculator {
    public static void main(String[] args) {

        Rectangle square = new Rectangle(0, 0);
        square.setDimensions(8);
        square.calculateArea();
        square.calculatePerimeter();
        Rectangle rectangle = new Rectangle(0, 0);
        rectangle.setDimensions(8.2, 9.3);
        rectangle.calculateArea();

        Circle circle = new Circle(24.5);
        circle.calculateArea();
        circle.calculatePerimeter();
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(square);
        shapes.add(rectangle);

        for (Shape shape : shapes) {
            System.out.println("Shape:" + shape.getClass().getSimpleName());
            System.out.println("Area:" + shape.calculateArea());
            System.out.println("Perimeter:" + shape.calculatePerimeter());
            System.out.println("****************************");
        }
    }
}