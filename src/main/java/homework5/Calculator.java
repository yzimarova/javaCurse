package homework5;

import java.util.Scanner;

public class Calculator extends Factory {

    public double calculate(double val1, double val2, String operator) {

        BinaryOperation operation = getOperationFor(operator);

        if (operation == null) {
            System.out.println("Неизвестный оператор " + operator);
            return Double.NaN;
        }
        return operation.resultFor(val1, val2);
    }

    public static void main(String[] args) {
        Parser parser = new Parser();
        Calculator calculator = new Calculator();

        Scanner in = new Scanner(System.in);
        System.out.println("Type expretion: ");
        String sentence = in.nextLine();
        in.close();
        double result = calculator.calculate(parser.getLeftOperand(parser.makeParse(sentence)), parser.getRightOperand(parser.makeParse(sentence)), parser.getOperator(parser.makeParse(sentence)));
        System.out.println(result);
//        System.out.println( calculator.calculate(456.546, 545.5465, "*") );
//        System.out.println( calculator.calculate(456.546, 545.5465, "-") );
    }
}
