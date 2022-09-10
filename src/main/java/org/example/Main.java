package org.example;

import org.example.shapes.*;

import java.io.PrintStream;

public class Main {
    private static final PrintStream out = System.out;

    public static void main(String[] args) {
        out.println("Modelling Geometric Shapes");

        out.println(new Circle(1));
        out.println(new Square(1));
        out.println(new Rectangle(2, 3));

        out.println(new EquilateralTriangle(1));
        out.println(new Parallelogram(1, 2, 3));
    }
}