/* 2. Вывести все простые числа от 1 до 1000*/

import java.util.Scanner;
public class decision_2 {
    public static void main(String[] args) {
        System.out.printf("Введите число: ");
        Scanner iScanner = new Scanner(System.in);
        int input = iScanner.nextInt();
        boolean b = true;
        for (int P = 2; P <= input; P++) {
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.println(P);
            else b = true;
        }
        iScanner.close();
    } 
}