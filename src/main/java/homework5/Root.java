package homework5;

public class Root implements BinaryOperation {
    public double resultFor(double left, double right) {
        return Math.pow(left, 1 / right);
    }
}
