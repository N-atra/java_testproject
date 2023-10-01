package ru.stqa.geometry.figure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {
    @Test
    void canCalculatePerimeter() {
        var p = new Triangle(7.0, 3.0, 5.0);
        double result = p.trianglePerimeter();
        Assertions.assertEquals(15.0, result);
    }
    @Test
    void canCalculateArea() {
        var a = new Triangle(7.0, 3.0, 5.0);
        double result =a.triangleArea();
        Assertions.assertEquals(6.49519052838329, result);
    }
}
