package lesson_02;

public class OperatorsLearning {
    public static void main(String[] args) {
        int myNum1 = 1;
        int myNum2 = 2;

        int total = myNum1 + myNum2;
        int multiple = myNum1 * myNum2;
        System.out.println("Total: " + total);
        System.out.println("Multiple: " + multiple);
        System.out.printf("%d + %d = %d", 1, 3, 4);

        System.out.println(5 / 2); //chia het
        System.out.println(5 % 2); // chia lay phan du

        int x = ++myNum1 + myNum2++;
        System.out.println(x);
        /* prefix First > right operand > assign value to left operand > postfix
         * Nghĩa là number1 tăng lên 2 rồi  + number 2 = 2 gán vào x = 4
         * sau đó number2 ++ lện = 3
         * number1 : 2
         * number2 : 3
         * x : 4
         * */


    }
}
