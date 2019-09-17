package homework5;

import java.util.Scanner;

public class Parser {

    public String[] makeParse(String expretion) {
        String[] elements = expretion.split(" ");
        return elements;
    }

    public String getOperator(String[] elements) {
        String operator = elements[1];
        return operator;
    }

    public double getLeftOperand(String[] elements) {
        double val1 = Integer.parseInt(elements[0]);
        return val1;
    }

    public double getRightOperand(String[] elements) {
        double val2 = Integer.parseInt(elements[2]);
        return val2;
    }

}
