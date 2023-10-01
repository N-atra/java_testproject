package ru.stqa.geometry;

import ru.stqa.geometry.figure.Triangle;

public class Geometry {
    public static void main(String[] args) {
        Triangle triangleObject = new Triangle(7., 3., 5.);
        triangleObject.printTrianglePerimeter();

        triangleObject.printTriangleArea();
    }
}
