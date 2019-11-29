package homework4;

import java.math.BigDecimal;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


public class Point {
    float x;
    float y;
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getDistance(Point pointTo) {
        float x1 = pointTo.getX();
        float y1 = pointTo.getY();
        BigDecimal result = new BigDecimal(sqrt(pow(x - x1, 2) + pow(y - y1, 2)));
        return result.floatValue();
    }
}
