package org.example.shapes;

import org.example.blueprints.IShape;
import org.example.blueprints.Triangle;

public class EquilateralTriangle extends Triangle implements IShape {
    public EquilateralTriangle(double base) {
        super(base);
    }

    @Override
    public String getName() {
        return "EquilateralTriangle";
    }

    @Override
    public double area() {
        return _base * _base * Math.sqrt(1.5);
    }

    @Override
    public double perimeter() {
        return _base * 3;
    }

}
