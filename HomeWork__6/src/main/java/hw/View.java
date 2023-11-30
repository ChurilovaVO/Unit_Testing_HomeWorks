package hw;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class View {
    private Scanner scanner = new Scanner(System.in);
    private MyList list1;
    private MyList list2;

    public void mainMenu() {
        while (true) {
            System.out.println("ВЫБЕРИТЕ ПУНКТ МЕНЮ: \n" +
                    "1. Ввести значения списков\n" +
                    "2. Показать средние значения списков\n" +
                    "3. Сравнить средние значения списков\n" +
                    "4. Выход\n");
            Integer choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                choice1();
            }
            if (choice == 2) {
                choice2();
            }
            if (choice == 3) {
                choice3();
            }
            if (choice == 4) {
                break;
            }
        }
    }

    public Integer[] getArray(String[] numberStrs) {
        Integer[] numbers = new Integer[numberStrs.length];
        for (int i = 0; i < numberStrs.length; i++) {
            try {
                numbers[i] = Integer.parseInt(numberStrs[i]);
            } catch (NumberFormatException nfe) {
                numbers[i] = null;
            }
        }
        return numbers;
    }

    public void choice1() {
        if (list1 == null) {
            System.out.println("Введите значения 1-го списка через пробел: ");
            String[] numberStrs1 = scanner.nextLine().split(" ");
            list1 = new MyList(Arrays.asList(getArray(numberStrs1)));
        }
        if (list2 == null) {
            System.out.println("Введите значения 2-го списка через пробел: ");
            String[] numberStrs2 = scanner.nextLine().split(" ");
            list2 = new MyList(Arrays.asList(getArray(numberStrs2)));
        }
        System.out.println("Значения УСПЕШНО введены!");
        System.out.println();
    }

    public void choice2() {
        list1.setAverageValue(list1.calculationAverageValue());
        list2.setAverageValue(list2.calculationAverageValue());
        System.out.println("Среднее значение 1-го списка: " + list1.getAverageValue());
        System.out.println("Среднее значение 2-го списка: " + list2.getAverageValue());
        System.out.println();
    }

    public void choice3() {
        System.out.println(MyList.compareAverageValue(list1.getAverageValue(), list2.getAverageValue()));
        System.out.println();
    }


}
