package org.example;

public class Rectangle extends Shape {

    private double _base, _height;

    Rectangle(double base, double height) {
        _base = base;
        _height = height;
    }

    @Override
    public double area() {
        return _base * _height;
    }

    @Override
    public double perimeter() {
        return (_base + _height) * 2;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

}
