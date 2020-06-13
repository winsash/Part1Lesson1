package ru.geekbrains.part1.lesson1;

import javax.accessibility.AccessibleIcon;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
        // метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        System.out.println("Введите имя для приветствия");
        String userName = scanner.nextLine();
        printHelloName(userName);

        //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte newByte = 127;
        short newShort = 433;
        int newInt = 254235434;
        long newLong = 1007700000;
        double newDouble = 1.328747289;
        float newFloat = (float) 12.12345;
        char newChar = 'A';
        System.out.println("Byte: " + newByte);
        System.out.println("Short: " + newShort);
        System.out.println("Int: " + newInt);
        System.out.println("Long: " + newLong);
        System.out.println("Double: " + newDouble);
        System.out.println("Float: " + newFloat);
        System.out.println("Char: " + newChar);

        //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        // где a, b, c, d – входные параметры этого метода;
        //Примечание: этот метод сделал без входных параметров.
        // Значения запрашиваю внутри, а возвращаю результат. С входными сделал другие примеры.
        float newResult = getExpressionResult();
        System.out.println("Result: " + newResult);

        //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
        // в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        System.out.println("Введите первое число");
        int firstValue = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondValue = scanner.nextInt();
        boolean resultOfComparison = getComparisonResult(firstValue, secondValue);
        if (resultOfComparison) {
            System.out.println("Сумма входит в диапазон");
        } else {
            System.out.println("Сумма НЕ входит в диапазон");
        }

        //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
        // в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
        System.out.println("Введите число для проверки на положительное или отрицательное");
        int thirdValue = scanner.nextInt();
        checkTheValueOfThePositive(thirdValue);

        //6. Написать метод, которому в качестве параметра передается целое число,
        // метод должен вернуть true, если число отрицательное;
        System.out.println("Введите ещё одно число для проверки на положительное или отрицательное");
        int fourthValue = scanner.nextInt();
        boolean newResult2 = checkTheValueOfTheNegative(fourthValue);
        System.out.println(newResult2);

        //8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
        // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        checkYearIsBissextile();

    }

    private static float getExpressionResult() {
        float a_value;
        float b_value;
        float c_value;
        float d_value;
        System.out.println("Введите число а");
        a_value = scanner.nextFloat();
        System.out.println("Введите число b");
        b_value = scanner.nextFloat();
        System.out.println("Введите число c");
        c_value = scanner.nextFloat();
        while (true) {
            System.out.println("Введите число d");
            d_value = scanner.nextFloat();
            if (d_value != 0) {
                break;
            } else {
                System.out.println("Переменная d является делителем и не должна быть равной нулю, введите другое число");
            }
        }
        float result = a_value * (b_value + (c_value / d_value));
        return result;
    }

    private static boolean getComparisonResult(int first, int second) {
        int sum = first + second;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static void checkTheValueOfThePositive(int value) {
        if (value >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    private static boolean checkTheValueOfTheNegative(int value) {
        if (value < 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void printHelloName(String name){
        System.out.println("Hello, " + name);
    }
    private static void checkYearIsBissextile(){
        System.out.println("Введите год");
        boolean result = true;
        int year = scanner.nextInt();
        if (year %4 == 0 && year %100 != 0 || year %400 == 0)
        {
            result = true;
        }
        else {
            result = false;
        }
        if (result){
            System.out.println("Високосный");
        }
        else {
            System.out.println("Не високосный");
        }

    }
}
