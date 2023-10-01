package ru.stqa.geometry.figure.figure;
/*
формуле Герона S=sqrt(p*(p-a)*(p-b)*(p-c) где a,b,c-длины сторон,р-полупириметер
 */

public class Triangle {
    static void printPerimeterArea(double side1, double side2, double side3) {
        System.out.println(String.format(
                "Периметр треугольника со сторонами %f, %f, %f  = %f", side1, side2, side3, perimetr));
    }
    private static double perimetrArea(double side1, double side2, double side3) {
        return side1+side2+side3;
    }
}

