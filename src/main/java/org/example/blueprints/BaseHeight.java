package org.example.blueprints;

public abstract class BaseHeight implements IShape {
    protected final double _base, _height;

    public BaseHeight(double base, double height) {
        _base = base;
        _height = height;
    }

    @Override
    public String toString() {
        return shapeToString();
    }

    @Override
    public double area() {
        return _base * _height;
    }
}
