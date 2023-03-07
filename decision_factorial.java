/* 1. Вычислить n! 
(произведение чисел от 1 до n)
Ввод: 5
n! 1 * 2 * 3 * 4 * 5 = 120 */

import java.util.Scanner;
public class decision_factorial {
        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                System.out.printf("Введите число: ");
                int end = in.nextInt();
                double result = 1;
                
                for ( int i = 1; i <= end; i++ ) {
                    result *= i;
                }
                System.out.println(result);
            }
        }
    }
