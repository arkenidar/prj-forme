package org.example;

public abstract class Shape {
    abstract double area();

    abstract double perimeter();

    abstract String getName();

    @Override
    public String toString() {
        return getName() + " { " +
                "area: " + area() + " perimeter: " + perimeter() +
                " } ";
    }
}
