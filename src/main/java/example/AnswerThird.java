package example;

import java.util.Scanner;

public class AnswerThird {
    public static void main(String[] args) {
        // Задаем числовой массив
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

        System.out.println("Элементы массива, кратные 3:");
        // Перебираем элементы массива
        for (int number : numbers) {
            // Проверяем, кратно ли число 3
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }
    }
}

