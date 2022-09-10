package org.example.shapes;

import org.example.blueprints.BaseHeight;
import org.example.blueprints.IShape;

public class Rectangle extends BaseHeight implements IShape {
    public Rectangle(double base, double height) {
        super(base, height);
    }

    public String getName() {
        return "Rectangle";
    }

    @Override
    public double perimeter() {
        return (_base + _height) * 2;
    }
}
