package ru.stqa.geometry.figure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.testng.asserts.Assertion;

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
    @Test
    void cannotCreateTriangleWithNegativeSide() {
        try {
            new Triangle(-4.0, -4.0, 4 );
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
        }
    }
    @Test
    void cannotCreateTriangleWithInvalidSide() {
        try {
            new Triangle(1.0, 2.0, 5.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
        }
    }
    @Test
    void TriangleEquality() {
        var t1 = new Triangle(4.0, 5.0, 3.0);
        var t2 = new Triangle(4.0, 5., 3.);
        Assertions.assertEquals(t1, t2);
    }
}

