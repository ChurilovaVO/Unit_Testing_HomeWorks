package hw.Test_1;

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    public static double squareRootExtraction(double number) {
        if (number == 0) {
            throw new ArithmeticException("It is not possible to extract the root from 0");
        }
        if (number < 0) {
            throw new ArithmeticException("It is impossible to extract the root from negative numbers");
        }

        double t;
        double squareRoot = number / 2;
        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / 2;
        }
        while ((t - squareRoot) != 0);
        return squareRoot;

        // или просто return Math.sqrt(number);
    }

    //Задание 1
    /**
     * @param purchaseAmount сумма покупки
     * @param discountAmount размер скидки
     * @return возвращает сумму покупки с учетом скидки
     */
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        double resultSum;
        if (purchaseAmount > 0) {
            if (0 < discountAmount && discountAmount < 100) {
                resultSum = purchaseAmount - (purchaseAmount * discountAmount / 100);
                return resultSum;
            }
            if (discountAmount == 0) {
                throw new ArithmeticException("Размер скидки равен 0!");
            }
            if (discountAmount < 0) {
                throw new ArithmeticException("Размер скидки имеет отрицательное значение!");
            }
            if (discountAmount == 100) {
                throw new ArithmeticException("Размер скидки равен 100 процентов!");
            } else {
                throw new ArithmeticException("Размер скидки больше 100 процентов!");
            }
        }
        if (purchaseAmount == 0) {
            throw new ArithmeticException("Сумма покупки равна 0!");
        }
        else {
            throw new ArithmeticException("Сумма покупки меньше 0!");
        }
}
}