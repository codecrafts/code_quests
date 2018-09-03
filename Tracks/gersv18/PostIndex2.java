package com.company;
import java.util.Scanner;

class PostIndexCheck {

    public static void main(String[] args) {
        String strIndex = inputIndex();
        boolean chckIndex = checkIndex(strIndex);

        if (chckIndex) {
            outputIndex(chckIndex);
        } else if (strIndex.equals("test")) {
            testCode();
        } else {
            outputIndex(false);
        }
    }

    static String inputIndex()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите почтовый индекс России или test: ");
        String rindex = in.next();
        return rindex;
    }

    static boolean checkIndex(String index)
    {
        int count = 0;
        if(index.length() == 6 && index.charAt(0)!='0') {

            for (int i = 0; i < index.length(); i++)
            {
                if(Character.isDigit(index.charAt(i)) )
                {
                    count++;
                }
            }
            return true;
        }
            return false;
    }

    static void outputIndex (boolean outCheckIndex){
        if (outCheckIndex)
        {
            System.out.println("Проверка индекса успешно пройдена.");
        } else {
            System.out.println("Проверка индекса не была пройдена.");
        }
    }
    static boolean testCode() {
        int testcount = 0;

        if (checkIndex("301848")) {
            System.out.println("Тест 1 пройден успешно!");
            testcount++;
        } else {
            System.out.println("Тест 1 не пройден!");
        }
        if (checkIndex("053_66")) {
            System.out.println("Тест 2 пройден успешно!");
            testcount--;
        } else {
            System.out.println("Тест 2 не пройден!");
        }
        if (checkIndex("900533")) {
            System.out.println("Тест 3 пройден успешно!");
            testcount++;
        } else {
            System.out.println("Тест 3 не пройден!");
        }
        if (!checkIndex("@@@444")) {
            System.out.println("Тест 4 пройден успешно!");
            testcount--;
        } else {
            System.out.println("Тест 4 не пройден!");
        }
        if (checkIndex("220677")) {
            System.out.println("Тест 5 пройден успешно!");
            testcount++;
        } else {
            System.out.println("Тест 5 не пройден!");
        }

        if(testcount == 4) {
            return true;
        } else {
            return false;
        }
    }
}
