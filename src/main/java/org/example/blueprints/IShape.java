package org.example.blueprints;

public interface IShape {
    double area();

    double perimeter();

    String getName();

    @Override
    String toString();

    default String shapeToString() {
        return getName() + " { " +
                "area: " + area() + " perimeter: " + perimeter() +
                " } ";
    }
}
