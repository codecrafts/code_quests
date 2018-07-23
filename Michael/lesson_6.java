package lesson_6;

import java.util.Scanner;

public class lesson_6 {

    public static void main(String[] args) {

        String telephonNumber = getTelephoneNumber();   // получаем телефонный номер с проверкой на валидность
        checkCountryCode(telephonNumber);               // проверка на кода страны

    }

    // ввод и проверка на валидность: длина строки, первый плюс, цифры в номере
    static String getTelephoneNumber() {
        String phoneNumber;

        do {
            System.out.println ("Введите 12-и значный номер телефона в формате +12345678901:");
            Scanner in = new Scanner (System.in);
            phoneNumber = in.next ();                                // ввод телефонного номера

        } while (!isTruePhone (phoneNumber));                       // проверка на валидность ввода
        return phoneNumber;
    }

    // проверка на валидность
    static boolean isTruePhone(String phoneNumber) {
        if (!phoneNumber.startsWith("+")) {      // провека - первый плюс
            System.out.println ("Ошибка ввода: в номере отствует +!");
            return false;
        }
        if (phoneNumber.length() != 12) {       // проверка на 12 знаков
            System.out.println ("Ошибка ввода: в номере не 12 знаков!");
            return false;
        }
        if (!isTrueNumber (phoneNumber)) {       // проверка на цифры в номере
            System.out.println ("Ошибка ввода: в номере присутствуют не только цифры!");
            return false;
        }
        return true;
    }

    // проверка на наличие в номере телефона только цифр
    static boolean isTrueNumber (String phoneNumber) {          // проверка на наличие в номере телефона только цифр
        //return Integer.parseInt (newPhoneNumber) > 0;
        //return phoneNumber.chars().allMatch( Character::isDigit );
        //return phoneNumber.matches("[\\d]+");

        for(int i=1; i<phoneNumber.length(); i++) {
            if (phoneNumber.charAt (i) < '0' || phoneNumber.charAt (i) > '9')
                return false;
        }
        return true;
    }

    // проверка на код страны
    static void checkCountryCode (String phoneNumber) {
        System.out.println (phoneNumber.startsWith ("7", 1) ? "Веденный телефонный номер - РФ" : "Веденный телефонный номер - не РФ");
    }
}
