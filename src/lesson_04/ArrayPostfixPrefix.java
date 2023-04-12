package lesson_04;

public class ArrayPostfixPrefix {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = ++a + b++;

        int[] array = new int[5];

        for (int i = 0; i < 5; i++) {
            array[i] = i + 1;
        }

        for (int value : array) {
            System.out.println(value);
        }
    }
}
