package lesson_5;
/*
������������ ������ ����������� �����. ��������� ��������� ��������� ����� � ������� ������� ���������.
��������: 5 -> V, 8 -> VIII, 10 -> X � ��
 */

import java.util.Scanner;

public class Lesson5 {
    static final int amountTest = 5;    // ���������� ������

    public static void main(String[] args) {
        int arabicNumber = 0;           // ��������� �����
        String romeNumber = "";         // ��������� �������� ��������� � �������

        arabicNumber = getArabicNumber();               // ���� ����� � �������
        romeNumber = arabicToRome(arabicNumber);        // ������� �� ���� � ���
        outToConsole(romeNumber, arabicNumber);         // ����� � �������

        System.out.println (tests () ? "���� �������" : "���� �� �������");         // ����� � ������� ���������� ����������� ������
    }

    static int getArabicNumber() {
        Scanner in = new Scanner (System.in);
        System.out.println ("������� ����������� ����� �� 1 �� 3999:");
        int number = in.nextInt();
        return number;
    }

    static String arabicToRome(int arabicNum){
        String romeNum = "";        // ������� �����
        int[] arabic = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        if (arabicNum >= 4000 || arabicNum <= 0)        // �������� ����� ������ � ���������� ��������
            return "";

        int index = arabic.length - 1;                  // ������ �������� ������� �������-������� �����
        while(arabicNum > 0)                            // � ����� �������� ������� �����
        {
            if(arabicNum >= arabic[index])
            {
                romeNum += roman[index];
                arabicNum -= arabic[index];
            }
            else
                index--;
        }
        return romeNum;
    }

    static void outToConsole(String romeNum, int arabicNum){
        if (romeNum.equals(""))
            System.out.println ("����� ��� ���������");
        else
            System.out.println ("��������� �������� ����� " + arabicNum + " � ������� ������� - " + romeNum);
    }

    static boolean tests (){
        int testComplete = 0;      // ���������� ������ ��������� ����������� �����

        if(arabicToRome(-12345).equals ("")) testComplete++;
        if(arabicToRome(-1).equals ("")) testComplete++;
        if(arabicToRome(4000).equals ("")) testComplete++;
        if(arabicToRome(0).equals ("")) testComplete++;
        if(!arabicToRome(123).equals ("")) testComplete++;

        return testComplete == amountTest;
    }
}