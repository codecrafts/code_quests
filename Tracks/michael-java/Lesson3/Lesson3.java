package CodeCrafts;

    import java.util.Scanner;

public class Lesson3 {

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

        if (action.equals("+"))
        {
            result = firstNumber + secondNumber;
            System.out.println("��������: " + firstNumber + "+" + secondNumber + "=" + result);
        }
        else
        if (action.equals("*"))
        {
            result = firstNumber * secondNumber;
            System.out.println("���������: " + firstNumber + "*" + secondNumber + "=" + result);
        }
        else
        if (action.equals("/"))
        {
            result = firstNumber / secondNumber;
            System.out.println("�������: " + firstNumber + "/" + secondNumber + "=" + result);
        }
        else
        if (action.equals("^"))
        {
            result = (int)firstNumber ^ (int)secondNumber;      // ���������� � ����� ������
            System.out.println("���� ���� ������� ������� �����, ��� ����� ��������� � ����� int!");
            System.out.println("XOR: " + (int)firstNumber  + "^" + (int)secondNumber + "=" + (int)result);
        }
        else if (action.equals("&"))
        {
            result = (int)firstNumber & (int)secondNumber;      // ���������� � ����� ������
            System.out.println("���� ���� ������� ������� �����, ��� ����� ��������� � ����� int!");
            System.out.println("Bitwise-AND: " + (int)firstNumber  + "&" + (int)secondNumber + "=" + (int)result);
        }
        else
            System.out.println("������ ������ ��������!");

    }
}