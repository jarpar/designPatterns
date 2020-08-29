package strategy.calcutator;

public class Program {

    public static void main(String[] args) {

//        Calculator calculator = new Calculator();
//        calculator.setOperator(new AddOperator());
//        int result = calculator.calculate(10, 2);
//        System.out.println(result);
//
//        calculator.setOperator(new SubstractOperator());
//        result = calculator.calculate(10, 2);
//        System.out.println(result);
//
//        calculator.setOperator(new MultiplyOperator());
//        result = calculator.calculate(10, 2);
//        System.out.println(result);
//
//        calculator.setOperator(new DivideOperator());
//        result = calculator.calculate(10, 2);
//        System.out.println(result);

        calculate("add", 10, 2);
    }

    private static int calculate(String operator, int a, int b) {

        Calculator calculator = new Calculator();

        if (operator.equals("add")) {
            calculator.setStrategy(new AddStrategy());
        } else if (operator.equals("minus")) {
            calculator.setStrategy(new SubstractStrategy());
        }  else if (operator.equals("multiply")) {
            calculator.setStrategy(new MultiplyStrategy());
        } else if (operator.equals("divide")) {
            calculator.setStrategy(new DivideStrategy());
        } else if (operator.equals("modulo")) {
            calculator.setStrategy(new ModuloStrategy());
        } else {
            return 0;
        }

        int result = calculator.calculate(10, 2);
        System.out.println(result);

        return result;
    }
}

