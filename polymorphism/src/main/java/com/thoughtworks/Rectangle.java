package com.thoughtworks;

public class Rectangle extends Shape {
    double length;
    double breadth;
    double side;
    double area;
    double perimeter;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;

    }
    public void setDimensions(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public void setDimensions(double side){
        this.length = side;
        this.breadth = side;
    }
    double calculateArea( ){
        area= length * breadth;
        return area;
    }
    double calculatePerimeter(){
        perimeter =2 *(length+breadth) ;
        return perimeter;
    }
}
