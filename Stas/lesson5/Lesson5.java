/*
Пользователь вводит натуральное число. Программа переводит введенное число в шестнадцатиричную систему счисления.
Например: 15 -> F, 16 -> 10 и тд
*/

package Stas.lesson5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {

        int decNumber = inputNat();
        String hexNumber = decToHex(decNumber);
        System.out.println("В шестнадцатеричной системе счисления натуральное число " + decNumber + " будет иметь вид: " + hexNumber);
    }

    static int inputNat() {             // Метод проверки ввода числа.
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

        return number;
    }

    static String decToHex(int natNum) {   // Метод перевода из десятичной системы в шестнадцатеричную.
        int celoe;
        int ostatok;
        ArrayList<Integer> hexMassive = new ArrayList<Integer>();

        do {
            celoe = natNum/16;
            ostatok = natNum - celoe*16;
            hexMassive.add(ostatok);        // Формируем массив из остатко деления на 16.
            natNum = natNum/16;
        } while( natNum > 0);

        ArrayList<Integer> reversedHex = reverseOfArray(hexMassive);    // Инвертируем массив, т.к. младший бит числа
        String numHex = "";                                             // находится в начале массива.

        for (Integer i : reversedHex) {           // Сопоставление цифр буквам 16-ричного алфавта.
            switch (Integer.toString(i)) {
                case "10":
                    numHex += "A";
                    break;
                case "11":
                    numHex += "B";
                    break;
                case "12":
                    numHex += "C";
                    break;
                case "13":
                    numHex += "D";
                    break;
                case "14":
                    numHex += "E";
                    break;
                case "15":
                    numHex += "F";
                    break;
                default:
                    numHex += i;
                    break;
            }
        }

        return numHex;
    }


    static ArrayList<Integer> reverseOfArray(ArrayList<Integer> arrayToReverse) {       // Метод для инверсии списка.
        ArrayList<Integer> reversedArray = new ArrayList<Integer>();
        for (int i = arrayToReverse.size()-1; i >= 0; i--) {
            reversedArray.add(arrayToReverse.get(i));
        }
        return reversedArray;
    }

}
