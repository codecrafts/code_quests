/*
Задача:
Пользователь вводит строку. Программа определяет является ли данная строка потенциально валидным IPv4 адресом.
(255.255.255.255 - является, а 255.255.255.257 - нет)

Решение:
1) Считать строку. Метод getInput();
2) Разбить на элементы, положить в массив. Метод inputToArray();
3) Проверить, являются ли элементы массива точкой или числом. Метод inputChecker();
4) Проверить есть ли три, и только три, точки. Метод dotChecker();
5) Создать массив из кусков между точками. Метод inputSplitter();
6) Проверить лежат ли значения этих кусков в интервале от 0 до 255. Метод numChecker();

*/
package Stas.lesson6;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {

        String ip = getInput();
        System.out.println("Введен корректный IPv4 адрес: " + ip);
    }

    static String getInput() {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите IPv4 адрес :");
        String ip = "";

        while (input.hasNext()) {
            ip = input.next();
            char[] charArray = inputToArray(ip);
            boolean checker = inputChecker(charArray);

            if (checker) {
                if (dotChecker(charArray)) {
                    ArrayList<String> splitArray = inputSplitter(ip);

                    if (numChecker(splitArray) && splitArray.size() == 4)
                        break;
                    else
                        System.out.println("Некорректный ввод. Повторите попытку.");
                }
                else
                    System.out.println("Некорректный ввод. Повторите попытку.");
            }else
                System.out.println("Некорректный ввод. Повторите попытку.");



        }

        return  ip;
    }

    static char[] inputToArray(String input) {
        char[] charArray = input.toCharArray();
        return charArray;
    }

    static boolean inputChecker(char[] input) {
        boolean checker = true;
        for (char element : input) {
            if (Character.isDigit(element) || element == '.')
                continue;
            else {
                checker = false;
                break;
            }
        }
        return checker;
    }

    static boolean dotChecker(char[] input) {
        int counter = 0;
        boolean dotCheck = false;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == '.')
                counter ++;
        }

        if (counter == 3)
            dotCheck = true;

        return dotCheck;
    }

    static ArrayList<String> inputSplitter(String input) {
        ArrayList<String> splitInput = new ArrayList<>();

        for (String element : input.split("\\.")) {
            splitInput.add(element);
        }
        return splitInput;
    }

    static boolean numChecker(ArrayList<String> input) {
        boolean checker = false;

        for (String element : input) {
            if (!element.equals("") && Integer.parseInt(element) >= 0 && Integer.parseInt(element) <= 255) {
                checker = true;
            }else {
                checker = false;
                break;
            }
        }

        return checker;

    }


}
