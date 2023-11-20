package hw;

public class Method {

    //Задание 1. Метод проверяет, является ли переданное число четным или нечетным
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Задание 2. Метод numberInInterval, который проверяет, попадает ли
    //переданное число в интервал (25;100)

    public boolean numberInInterval(int n) {
        if (n >= 25 && n<=100) {
            return true;
        }
        return false;
    }
}
