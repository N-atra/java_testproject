package ru.stqa.geometry.figure;

import java.util.Objects;

import static java.lang.Math.sqrt;

public class Triangle {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double a, double b, double c) {
        this.side1 = a;
        this.side2 = b;
        this.side3 = c;

        if (side1<=0 || side2<=0 || side3<=0) {
            throw new IllegalArgumentException("Triangle side should be non-negative");
        }
        if (side1+side2 <= side3 || side1+side3 <= side2 || side2+side3 <=side1)
            throw new IllegalArgumentException("This is not Triangle");
    }

    public void printTrianglePerimeter() {
        System.out.println(String.format(
                "Периметр треугольника со сторонами %f, %f, %f  = %f", side1, side2, side3, trianglePerimeter()));
    }
    public double trianglePerimeter() {
        return side1+side2+side3;
    }

    public void printTriangleArea() {
        System.out.println(String.format(
                "Площадь треугольника со сторонами %f, %f, %f  = %f", side1, side2, side3, triangleArea()));
    }

    public double triangleArea() {
        double p = trianglePerimeter()/2;
        return sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return (Double.compare(triangle.side1, side1) == 0 && Double.compare(triangle.side2, side2) == 0 && Double.compare(triangle.side3, side3) == 0)
                || (Double.compare(triangle.side1, side1) == 0 && Double.compare(triangle.side2, side3) == 0 && Double.compare(triangle.side3, side2) == 0)
                || (Double.compare(triangle.side1, side2) == 0 && Double.compare(triangle.side2, side1) == 0 && Double.compare(triangle.side3, side3) == 0)
                || (Double.compare(triangle.side1, side2) == 0 && Double.compare(triangle.side2, side3) == 0 && Double.compare(triangle.side3, side1) == 0)
                || (Double.compare(triangle.side1, side3) == 0 && Double.compare(triangle.side2, side1) == 0 && Double.compare(triangle.side3, side2) == 0)
                || (Double.compare(triangle.side1, side3) == 0 && Double.compare(triangle.side2, side2) == 0 && Double.compare(triangle.side3, side1) == 0);
    }

    @Override
    public int hashCode() {
        return Objects.hash(side1, side2, side3);
    }
}

