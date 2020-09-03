package com.javafordev.lesson4.task3;

import static com.javafordev.lesson4.task3.Validator.removeNullElementsFromArray;
import static com.javafordev.lesson4.task3.Validator.validateInputParameterForArray;

public class TriangleService {

    private Triangle[] triangles;

    public TriangleService(Triangle[] triangles) {
        this.triangles = validateInputParameterForArray(triangles);
    }

    public Triangle[] getTriangles() {
        return triangles;
    }

    public void setTriangles(Triangle[] triangles) {
        this.triangles = validateInputParameterForArray(triangles);
    }

    public Triangle findMinBySquare() {
        Triangle triangleWithMinSquare = triangles[0];
        double minElement = this.triangles[0].calculateSquare();
        for (int i = 0; i < triangles.length; i++) {
            if ((triangles[i] != null) && (triangles[i].calculateSquare() < minElement)) {
                triangleWithMinSquare = triangles[i];
            }
        }
        return triangleWithMinSquare;
    }

    public Triangle findMaxBySquare() {
        Triangle triangleWithMaxSquare = triangles[0];
        double maxElement = this.triangles[0].calculateSquare();
        for (int i = 0; i < triangles.length; i++) {
            if ((triangles[i] != null) && (triangles[i].calculateSquare() > maxElement)) {
                triangleWithMaxSquare = triangles[i];
            }
        }
        return triangleWithMaxSquare;
    }

    public Triangle findMinByPerimeter() {
        Triangle triangleWithMinPerimeter = triangles[0];
        double minElement = this.triangles[0].calculatePerimeter();
        for (int i = 0; i < triangles.length; i++) {
            if ((triangles[i] != null) && (triangles[i].calculatePerimeter() < minElement)) {
                triangleWithMinPerimeter = triangles[i];
            }
        }
        return triangleWithMinPerimeter;
    }

    public Triangle findMaxByPerimeter() {
        Triangle triangleWithMaxPerimeter = triangles[0];
        double maxElement = this.triangles[0].calculatePerimeter();
        for (int i = 0; i < triangles.length; i++) {
            if ((triangles[i] != null) && (triangles[i].calculatePerimeter() > maxElement)) {
                maxElement = triangles[i].calculatePerimeter();
                triangleWithMaxPerimeter = triangles[i];
            }
        }
        return triangleWithMaxPerimeter;
    }

    public Triangle[] findByNinetyAngle() {
        Triangle[] ninetyAngleTriangles = new Triangle[this.triangles.length];
        int j = 0;
        for (int i = 0; i < this.triangles.length; i++) {
            if ((this.triangles[i] != null) && (this.triangles[i].isTriangleNinetyAngle())) {
                ninetyAngleTriangles[j] = this.triangles[i];
                j++;
            }
        }
        return removeNullElementsFromArray(ninetyAngleTriangles);
    }

    public Triangle[] findByIsosceles() {
        Triangle[] isoscelesTriangles = new Triangle[this.triangles.length];
        int j = 0;
        for (int i = 0; i < this.triangles.length; i++) {
            if ((this.triangles[i] != null) && (this.triangles[i].isTriangleIsosceles())) {
                isoscelesTriangles[j] = this.triangles[i];
                j++;
            }
        }
        return removeNullElementsFromArray(isoscelesTriangles);
    }

    public Triangle[] findByEquilateral() {
        Triangle[] equilateralTriangles = new Triangle[this.triangles.length];
        int j = 0;
        for (int i = 0; i < this.triangles.length; i++) {
            if ((this.triangles[i] != null) && (this.triangles[i].isTriangleEquilateral())) {
                equilateralTriangles[j] = this.triangles[i];
                j++;
            }
        }
        return removeNullElementsFromArray(equilateralTriangles);
    }

    public Triangle[] findByRandom() {
        Triangle[] randomTriangles = new Triangle[this.triangles.length];
        int j = 0;
        for (int i = 0; i < this.triangles.length; i++) {
            if ((this.triangles[i] != null) && (!(this.triangles[i].isTriangleIsosceles())) && !(this.triangles[i].isTriangleIsosceles()) && !(this.triangles[i].isTriangleNinetyAngle())) {
                randomTriangles[j] = this.triangles[i];
                j++;
            }
        }
        return removeNullElementsFromArray(randomTriangles);
    }



}
