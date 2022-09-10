package org.example;

public class Square extends Rectangle {

    Square(double base) {
        super(base, base);
    }

    @Override
    public String getName() {
        return "Square";
    }
}
