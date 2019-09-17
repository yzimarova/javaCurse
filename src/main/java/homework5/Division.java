package homework5;

public class Division implements BinaryOperation{

    public double resultFor(double left, double right) {

        double result = 0;
        if (right == 0) {
            System.out.println("Division by null is not allow!");
        } else {
            result =  left / right;
        }
        return result;
    }

}
