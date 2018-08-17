package CodeCrafts;

import java.util.Scanner;

public class Lesson3.1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        float result;

        System.out.println("���������-�����������.");

        System.out.println("������� ���� ������ �����:");
        float firstNumber = in.nextFloat();

        System.out.println("������� ���� ������ �����:");
        float secondNumber = in.nextFloat();

        System.out.println("������� ����������� ��������: +, *, /, ^, &");
        String action = in.next();

        switch (action)
        {
            case "+":
                result = firstNumber + secondNumber;
                System.out.println("���������� " + firstNumber + "+" + secondNumber + "=" + result);
                break;
            case "*":
                result = firstNumber * secondNumber;
                System.out.println("�������� " + firstNumber + "*" + secondNumber + "=" + result);
                break;
            case "/":
                result = firstNumber / secondNumber;
                System.out.println("����� " + firstNumber + "/" + secondNumber + "=" + result);
                break;
            case "^":
                result = (int)firstNumber ^ (int)secondNumber;      // ���������� � ����� ������
                System.out.println("� ������ ����� ������� �����, ��� ����� ��������� � �����!");
                System.out.println("XOR: " + (int)firstNumber  + "^" + (int)secondNumber + "=" + (int)result);
                break;
            case "&":
                result = (int)firstNumber & (int)secondNumber;      // ���������� � ����� ������
                System.out.println("� ������ ����� ������� �����, ��� ����� ��������� � �����!");
                System.out.println("Bitwise-AND: " + (int)firstNumber  + "&" + (int)secondNumber + "=" + (int)result);
                break;
            default:
                System.out.println("������ ������ ��������!");
        }
    }
}