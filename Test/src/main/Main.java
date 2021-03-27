package main;

public class Main {
    /**
        Метод считает сумму цифр в целом числе.
        Вход: целое число num.
        Выход: сумма цифр числа num.
        */
    public static int sumOfDigits(int num){
        int sum = 0;
        num = Math.abs(num);
        while(num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = -123045;
        System.out.println(sumOfDigits(num));
    }
}
