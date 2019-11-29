/* Создать класс Point, который задает координаты в двумерном пространстве. Определить метод для расчета расстояния от текущей точки до указанной.
Создать класс Triangle, точки которого заданы классом Point. Определить методы для расчета периметра и площади треугольника.
А также метод классификации треугольника (равнобедренный, равносторонний, прямоугольный, произвольный).
Сгенерировать массив случайных треугольников. (100 000)
Найти первый попавшийся в массиве треугольник, заданного пользователем класса, вывести в консоль информацию о треугольнике, его периметр и площадь.
Если треугольник не найден, сообщить об этом пользователю.
 */

package homework4;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        TriangleGenerator triangleGenerator = new TriangleGenerator();
        Triangle[] triangles = triangleGenerator.getTrianglesArr();
        Scanner in = new Scanner(System.in);
        System.out.println("Select type of triangl:");
        System.out.println("Equilateral - 1");
        System.out.println("Isosceles - 2");
        System.out.println("Straight - 3");
        System.out.println("ARBITRARY - 4");
        String input = in.nextLine();
        TriangleType type = null;
        switch(input) {
            case "1":
                type = TriangleType.EQUILATERAL;
                break;
            case "2":
                type = TriangleType.ISOSCELES;
                break;
            case "3":
                type = TriangleType.STRAIGHT;
                break;
            case "4":
                type = TriangleType.ARBITRARY;
                break;
            default:
                System.out.println("Incorrect entry");
                System.exit(0);
        }
        for(int i = 0; i < 100000; i++) {
            if(triangles[i].getType() == type) {
                System.out.println("Found " + type.name() + " triangle.");
                System.out.println("Index: " + i);
                System.out.println(triangles[i]);
                System.out.println("Perimeter: " + triangles[i].getPerimeter());
                System.out.println("Square: " + triangles[i].getSquare());
                return;
            }
        }
        System.out.println(type.name() +  " triangle not found");
    }
}
