package homework5;

import java.lang.Math;

public class Power implements BinaryOperation {
    public double resultFor(double left, double right) {

        if (right == 1) {
            return left;
        } if (right < 0) {
            double temp1 = left;
            for (int i = 1; i < Math.abs(right); i++) {
                left = 1 / left * temp1;
            }
            return left;
        } else {
            double temp2 = left;
            for (int i = 1; i < right; i++) {
                left *= temp2;
            }
            return left;
        }
    }
}
