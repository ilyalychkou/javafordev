package com.javafordev.lesson4.task3;

import static com.javafordev.lesson4.task3.Triangle.getMaxTriangleByFilter;
import static com.javafordev.lesson4.task3.Triangle.getMinTriangleByFilter;

public class TriangleRunner {
    /**
     * Тестовые значения:
     * 1. прямоугольные - треугольник Пифагора (3,4,5), прямоугольные 6,8,10
     * 2. равнобедренные - равны только 1/2, равны только 2/3, равны только 1/3
     * 3. равносторонние - три стороны равны
     * 4. произвольные - ни одна из сторон не равны
     * 5. треугольник можно построить? метод isTriangleCorrect- 2/10/11(можно), 2/10/111 (нельзя)
     * 6. нулевые/отрицательные значения сторон - при них треугольник нельзя построить
     */
    public static void main(String[] args) {

        int countOfTriangles = 12;
        Triangle[] triangles = new Triangle[countOfTriangles];

        triangles[0] = new Triangle(3, 4, 5); //прямоугольныи (треугольник Пифагора)
        triangles[1] = new Triangle(2, 10, 11); //произвольныи
        triangles[2] = new Triangle(6, 8, 10); // прямоугольныи
        triangles[3] = new Triangle(9, 6, 9); //равностороннии
        triangles[4] = new Triangle(6, 6, 11); //равнобедренныи
        triangles[5] = new Triangle(4, 7, 7); //равнобедренныи
        triangles[6] = new Triangle(9, 12, 15); //прямоугольныи (треугольник Пифагора)
        triangles[7] = new Triangle(12, 16, 20); //прямоугольныи (треугольник Пифагора)
        triangles[8] = new Triangle(8, 8, 8); //равностороннии
        triangles[9] = new Triangle(3, 3, 3); //равностороннии
        triangles[10] = new Triangle(2, 3, 4); // произвольныи
        triangles[11] = new Triangle(11, 12, 22); // произвольныи

        int countOfNinetyAngleTriangle = 0;
        int countOfIsoscelesTriangle = 0;
        int countOfEquilateralTriangle = 0;
        int countOfRandomTriangle = 0;

        Triangle[] ninetyAngleTriangles = new Triangle[countOfTriangles];
        Triangle[] isoscelesTriangles = new Triangle[countOfTriangles];
        Triangle[] equilateralTriangles = new Triangle[countOfTriangles];
        Triangle[] randomTriangles = new Triangle[countOfTriangles];

        for (Triangle element : triangles) {
            if (element.isTriangleNinetyAngle()) {
                ninetyAngleTriangles[countOfNinetyAngleTriangle] = element;
                countOfNinetyAngleTriangle++;
            }
            if (element.isTriangleIsosceles()) {
                isoscelesTriangles[countOfIsoscelesTriangle] = element;
                countOfIsoscelesTriangle++;
            }
            if (element.isTriangleEquilateral()) {
                equilateralTriangles[countOfEquilateralTriangle] = element;
                countOfEquilateralTriangle++;
            }
            if (!(element.isTriangleNinetyAngle()) && !(element.isTriangleIsosceles()) && !(element.isTriangleEquilateral())) {
                randomTriangles[countOfRandomTriangle] = element;
                countOfRandomTriangle++;
            }
        }

        System.out.println("Инфо о количестве треугольников по типам...");
        System.out.println("Количество прямоугольных треугольников : " + countOfNinetyAngleTriangle);
        System.out.println("Количество равнобедренных треугольников : " + countOfIsoscelesTriangle);
        System.out.println("Количество равносторонних треугольников : " + countOfEquilateralTriangle);
        System.out.println("Количество произвольных треугольников : " + countOfRandomTriangle);
        System.out.println();

        System.out.println("Инфо о мин (макс) площади (периметре) прямоугольных треугольников...");
        System.out.println("Мин площадь элемента массива прямоугольных треугольников : " + getMinTriangleByFilter(ninetyAngleTriangles, "square"));
        System.out.println("Макс площадь элемента массива прямоугольных треугольников : " + getMaxTriangleByFilter(ninetyAngleTriangles, "square"));
        System.out.println("Мин периметр элемента массива прямоугольных треугольников : " + getMinTriangleByFilter(ninetyAngleTriangles, "perimeter"));
        System.out.println("Макс периметр элемента массива прямоугольных треугольников : " + getMaxTriangleByFilter(ninetyAngleTriangles, "perimeter"));
        System.out.println();

        System.out.println("Инфо о мин (макс) площади (периметре) равнобедренных треугольников...");
        System.out.println("Мин площадь элемента массива равнобедренных треугольников : " + getMinTriangleByFilter(isoscelesTriangles, "square"));
        System.out.println("Макс площадь элемента массива равнобедренных треугольников : " + getMaxTriangleByFilter(isoscelesTriangles, "square"));
        System.out.println("Мин периметр элемента массива равнобедренных треугольников : " + getMinTriangleByFilter(isoscelesTriangles, "perimeter"));
        System.out.println("Макс периметр элемента массива равнобедренных треугольников : " + getMaxTriangleByFilter(isoscelesTriangles, "perimeter"));
        System.out.println();

        System.out.println("Инфо о мин (макс) площади (периметре) равносторонних треугольников...");
        System.out.println("Мин площадь элемента массива равносторонних треугольников : " + getMinTriangleByFilter(equilateralTriangles, "square"));
        System.out.println("Макс площадь элемента массива равносторонних треугольников : " + getMaxTriangleByFilter(equilateralTriangles, "square"));
        System.out.println("Мин периметр элемента массива равносторонних треугольников : " + getMinTriangleByFilter(equilateralTriangles, "perimeter"));
        System.out.println("Макс периметр элемента массива равносторонних треугольников : " + getMaxTriangleByFilter(equilateralTriangles, "perimeter"));
        System.out.println();

        System.out.println("Инфо о мин (макс) площади (периметре) произвольных треугольников...");
        System.out.println("Мин площадь элемента массива произвольных треугольников : " + getMinTriangleByFilter(randomTriangles, "square"));
        System.out.println("Макс площадь элемента массива произвольных треугольников : " + getMaxTriangleByFilter(randomTriangles, "square"));
        System.out.println("Мин периметр элемента массива произвольных треугольников : " + getMinTriangleByFilter(randomTriangles, "perimeter"));
        System.out.println("Макс периметр элемента массива произвольных треугольников : " + getMaxTriangleByFilter(randomTriangles, "perimeter"));
        System.out.println();
    }
}
