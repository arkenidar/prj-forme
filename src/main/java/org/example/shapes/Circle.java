package org.example.shapes;

import org.example.blueprints.IShape;

public class Circle implements IShape {

    private final double _radius;

    public Circle(double radius) {
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

    @Override
    public String toString() {
        return shapeToString();
    }
}
