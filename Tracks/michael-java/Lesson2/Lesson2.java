package CodeCrafts;

public class Lesson2 {
    private static final int hundredPercent = 100;      // ��� ���������
    private static final int kopeckInRuble = 100;       // ������ � ������

    public static void main(String[] args) {

        double income;                      // �����
        int time = 100;                      // ���� �������� � ����
        int startAmountRub = 12345;         // ��������� ����� - �����
        int startAmountKop = 99;            // ��������� ����� - �������
        int startAmount;                    // ��������� ����� � ������
        double percent = 7.5;               // ������� ������� ��������
        int dayInYear = 365;                // ���� � ����

        startAmount = startAmountRub * kopeckInRuble + startAmountKop;      // ��������� ����� � ��������
        income = (startAmount * percent * time / (dayInYear * hundredPercent));
        income = income / kopeckInRuble;                                    // ��������� ����� � ������

        System.out.println("����� �� " + time + " ���� ��� " + percent + "% �������");
        System.out.println("� �������� ���������� ������: " + startAmountRub + "." + startAmountKop + " ���");
        System.out.println("��������: " + income + " ���");

    }
}