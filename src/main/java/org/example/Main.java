package org.example;

import java.io.PrintStream;

public class Main {
    private static final PrintStream out = System.out;

    public static void main(String[] args) {
        out.println("exercise");
        out.println(new Circle(1));
        out.println(new Square(1));
        out.println(new Rectangle(2, 3));
    }
}