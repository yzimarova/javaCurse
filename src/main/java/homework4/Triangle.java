package homework4;

import java.math.BigDecimal;
import static java.lang.Math.*;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    private float ab;
    private float bc;
    private float ac;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        ab = a.getDistance(b);
        bc = b.getDistance(c);
        ac = a.getDistance(c);
    }

    @Override
    public String toString() {
        String resultString = "Triangle [a(" + a.getX() + "; " + a.getY() +
                ") b(" + b.getX() + "; " + b.getY() +
                ") c(" + c.getX() + "; " + c.getY() + ")]";
        return resultString;
    }

    public float getPerimeter() {
        return ab + bc + ac;
    }

    public double getSquare(){
        float p = getPerimeter()/2;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    }

    public TriangleType getType() {

        if(checkEquilateral()) {
            return TriangleType.EQUILATERAL;
        }

        if(checkIsosceles()) {
            return TriangleType.ISOSCELES;
        }

        if(checkStraight()) {
            return TriangleType.STRAIGHT;
        }

        return TriangleType.ARBITRARY;
    }

    private boolean checkEquilateral() {
        if(a.getDistance(b) == b.getDistance(c) &&
                b.getDistance(c) == c.getDistance(a)) {
            return true;
        }
        return false;
    }

    private boolean checkIsosceles() {
        if((ab == bc && ab != ac) || (ac == bc && ac != ab)) {
            return true;
        }
        return  false;
    }

    private boolean checkStraight() {
        if(Math.pow(ab, 2) + Math.pow(ac, 2) == Math.pow(bc, 2)
        || Math.pow(ab, 2) + Math.pow(bc, 2) == Math.pow(ac, 2)
        || Math.pow(ac, 2) + Math.pow(bc, 2) == Math.pow(ab, 2)) {
            return true;
        }
        return false;
    }
}
