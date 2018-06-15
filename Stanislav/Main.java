package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	/*
    тип long, операции '-', '%', '*', '|' (Bitwise-OR), '»' (shift)
    */

        long a;
        long b;
        int op;
        long result = 0;
        Scanner in = new Scanner(System.in);

        for (;;) {
            System.out.print("Введите первое число a : ");
            a = in.nextLong();
            System.out.print("Введите второе число b : ");
            b = in.nextLong();

            System.out.println("Введите № операции над числами :");
            System.out.println(" 1 - операция - ;");
            System.out.println(" 2 - операция % ;");
            System.out.println(" 3 - операция * ;");
            System.out.println(" 4 - операция | ;");
            System.out.println(" 5 - операция >>  :");
            op = in.nextInt();

            if (op == 1)
            {
                result = a - b;
                System.out.println("Результат операции - над числами a и b = " + result);
            }
            else if (op == 2)
            {
                result = a % b;
                System.out.println("Результат операции % над числами a и b = " + result);
            }
            else if (op == 3)
            {
                result = a * b;
                System.out.println("Результат операции * над числами a и b = " + result);
            }
            else if (op == 4)
            {
                result = a | b;
                System.out.println("Результат операции | над числами a и b = " + result);
            }
            else if (op == 5)
            {
                result = a >> b;
                System.out.println("Результат операции >> над числами a и b = " + result);
            }
        }
    }
}
