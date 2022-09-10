package org.example.shapes;

public class Square extends Rectangle {
    public Square(double base) {
        super(base, base);
    }

    @Override
    public String getName() {
        return "Square";
    }

}
