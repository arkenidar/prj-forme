package org.example;

public class Circle extends Shape {

    private double _radius;

    Circle(double radius) {
        _radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * _radius * _radius;
    }

    @Override
    public double perimeter() {
        return Math.PI * _radius * 2;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
