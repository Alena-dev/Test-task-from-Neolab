package main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    /**
        Метод считает сумму цифр в целом числе.
        Вход: целое число num.
        Выход: сумма цифр числа num.
        */
    static int sumOfDigits(int num){
        int sum = 0;
        num = Math.abs(num);
        while(num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    /**
       Метод находит три наибольших элемента в массиве чисел.
       Вход: массив вещественных чисел.
       Выход: лист из трех наибольших вещественных чисел.
       */
    static List<Double> three_highest(double[] numbers) {
        LinkedList<Double> maxes = new LinkedList<>(Arrays.asList(Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE));
        int index = 0;
        int counter = 0;
        for (double num: numbers) {
            if (num < maxes.getFirst() || Math.abs(num - maxes.getFirst()) < 1e-9) {
                continue;
            }

            for (double max: maxes) {
                counter++;
                if (num > max) {
                    index = counter;
                }
            }

            maxes.add(index, num);
            maxes.poll();
            counter = 0;
            index = 0;
            }
        return maxes;
    }

    public static void main(String[] args) {
        int num = -123045;
        System.out.println(sumOfDigits(num));
        System.out.println(three_highest(new double[]{Double.MIN_VALUE, 1.2, 0.0, -9.9, 45.8, 46.3, 24.2}));
    }
}
