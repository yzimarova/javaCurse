package homework5;

public class Factory {

    public BinaryOperation getOperationFor(String operator) {
        if ("*".equals(operator)) {
            return new Multiplication();
        } else if ("-".equals(operator)) {
            return new Subtraction();
        } else if ("/".equals(operator)) {
            return new Division();
        } else if ("^".equals(operator)) {
            return new Power();
        } else if ("|".equals(operator)) {
            return new Root();
        } else if ("+".equals(operator)) {
            return new Addition();
        } else if ("log".equals(operator)) {
            return new Logarithm();
        }
        return null;
    }

}
