/*
Пользователь вводит натуральное число. Программа переводит введенное число в шестнадцатиричную систему счисления.
Например: 15 -> F, 16 -> 10 и тд
*/

package Stas.lesson5;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        int number = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите натуральное число:");

        while (input.hasNext()) {
            if (input.hasNextInt()) {
                number = input.nextInt();
                if (number > 0) {
                    break;
                }else {
                    System.out.println("Введенное значение не является натуральным числом. Повторите ввод:");
                }
            }else {
                System.out.println("Введенное значение не является натуральным числом. Повторите ввод:");
                input.next();
            }
        }

        System.out.println("Натуральное число " + number + " в шестнадцатеричной системе будет иметь вид " + Integer.toHexString(number));
    }
}
