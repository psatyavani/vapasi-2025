package com.thoughtworks;

public class Circle  extends Shape{
    private double radius;
    double area;
    double perimeter;

    public Circle(double radius ){
        this.radius = radius;

    }

    double calculateArea(){
        area= Math.PI*(radius * radius);
        return area;
    }
    double calculatePerimeter(){
        perimeter =2 *Math.PI*(radius);
        return perimeter;
    }

}
