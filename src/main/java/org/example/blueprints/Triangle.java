package org.example.blueprints;

public abstract class Triangle implements IShape {
    protected final double _base;

    public Triangle(double base) {
        _base = base;
    }

    @Override
    public String toString() {
        return shapeToString();
    }
}
