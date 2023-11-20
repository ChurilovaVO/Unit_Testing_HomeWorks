import hw.Method;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class TestMethods {
    Method method;

    @BeforeEach
    void setUp() {
        method = new Method();
    }

    //Задание 1. Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли
    //переданное число четным или нечетным

    @ParameterizedTest
    @ValueSource(ints = {-4, 0, 6})
    void testEvenOddNumberEven(int i) {
        assertTrue(method.evenOddNumber(i));
    }

    @ParameterizedTest
    @ValueSource(ints = {-5, 11})
    void testEvenOddNumberOdd(int i) {
        assertFalse(method.evenOddNumber(i));
    }

    //Задание 2. Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли
    //переданное число в интервал (25;100)

    @Test
    void testNumberInIntervalIn(){
        assertTrue(method.numberInInterval(50));
    }
    @Test
    void testNumberInIntervalOut(){
        assertFalse(method.numberInInterval(20));
    }

    @ParameterizedTest
    @ValueSource(ints = {25,100})
    void testNumberInIntervalEdge(int i) {
        assertTrue(method.numberInInterval(i));
    }
}
