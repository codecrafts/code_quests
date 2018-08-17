package searchSubstring;

    /*  ���� ��� ������.
        ������ - ����������� �� ������� ����� � ������ � �������������.
        ����� ���������� ���������� ���� ��������� �����������.
     */
public class Lesson6 {

    static String words = "�������, � �������� ������ ����...";
    static String separators = "., !-:+";

    public static void main(String[] args) {

        int countWords = 0;

        countWords = countWords(words, separators);
        printResult(countWords);

        System.out.println(testCode() ? "���� �������" : "���� �� �������");
    }

    static int countWords(String testWords, String testSeparators) {

        boolean isWasLetter = false;   // ��������� - ����� ��� ���
        int counterWords = 0;          // ������� ����

        for (int index = 0; index < testWords.length(); index++) {       // ������� ��������� ����������� ������ �� �����/�� �����

            if (isLetter(index, testWords, testSeparators)) {            // ������� ������ - �����
                isWasLetter = true;                                      // ������ ��������� �� "�����"
            } else {                                                     // ������� ������ - �� �����
                if (isWasLetter)                                         // ����� �� �����, � ����� ��� - �����, ������� �����
                    counterWords++;
                isWasLetter = false;                                     // ������ ��������� �� "�� �����"
            }
        }
        if(isWasLetter)                                                  // � ������ - ��������� �����
            counterWords++;
        return counterWords;
    }

    static boolean isLetter(int index, String whatTest, String withTest) {      // �������� ��������� ��������� � ������

        char letter = whatTest.charAt(index);
        boolean isLetter = true;                                                // ��������� �������� ����������� ������: �����/�� �����

        for (int j = 0; j < withTest.length(); j++) {                // �������� �������� ����������� ������
            if (letter == withTest.charAt(j)) {                       // ������� �����������
                isLetter = false;
                break;
            }
        }
        return isLetter;
    }

    public static void printResult(int result) {

        System.out.println ("� ������: " + "\"" + words + "\" " + result + " ����");
    }

    public static boolean testCode () {

        int counter = 0;
        Boolean testPassed = false;

        if (countWords("������������", " !") == 1)
            counter++;
        if (countWords( "       ������������", " !") == 1)
            counter++;
        if (countWords("���-������ - ��� �� ���-��", " -") == 6)
            counter++;
        if (countWords("������������     ", " ,") == 1)
            counter++;
        if (countWords(" ���� ���� ���� ", " ") == 3)
            counter++;
        if (countWords(" ", " !.") == 0)
            counter++;
        if (countWords("", " ") == 0)
            counter++;

        if (counter == 7)
            testPassed = true;
        return testPassed;
    }

}