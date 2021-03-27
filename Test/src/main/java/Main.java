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
    static List<Double> threeHighest(double[] numbers) {
        if (numbers == null){
            return null;
        }
        if (numbers.length < 3) {
            if (numbers.length == 2) {
                return Arrays.asList(Math.min(numbers[0], numbers[1]), Math.max(numbers[0], numbers[1]), null);
            }
            if (numbers.length == 1) {
                return Arrays.asList(numbers[0], null, null);
            }
            return Arrays.asList(null, null, null);
        }
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
}
