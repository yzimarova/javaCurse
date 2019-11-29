package homework4;

import java.util.Random;

public class TriangleGenerator {

    public Triangle[] getTrianglesArr() {
        Triangle[] trianglesArr = new Triangle[100000];
        Random random = new Random();
        for(int i = 0; i < 100000; i++) {
            Triangle triangle1 = new Triangle(new Point(random.nextInt(10), random.nextInt(10)),
                    new Point(random.nextInt(10), random.nextInt(10)),
                    new Point(random.nextInt(10), random.nextInt(10)));
            trianglesArr[i] = triangle1;
        }
        return trianglesArr;
    }
}
