/* 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! 
(произведение чисел от 1 до n)
Ввод: 5
Треугольное число 1 + 2 + 3 + 4 + 5 = 15
n! 1 * 2 * 3 * 4 * 5 = 120 */

import java.util.Scanner;

public class decision {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d \n", number(i));
        iScanner.close();
    }

    public static int number(int N) {
        return (N * (N + 1)) / 2;         /*Нахождение суммы чисел от 1 до N*/ 
    }
}