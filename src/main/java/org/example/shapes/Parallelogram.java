package org.example.shapes;

import org.example.blueprints.BaseHeight;
import org.example.blueprints.IShape;

public class Parallelogram extends BaseHeight implements IShape {
    private final double _side;

    public Parallelogram(double base, double height, double side) {
        super(base, height);
        _side = side;
    }

    @Override
    public String getName() {
        return "Parallelogram";
    }

    @Override
    public double perimeter() {
        return (_base + _side) * 2;
    }

}
