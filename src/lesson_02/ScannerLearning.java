package lesson_02;
import java.util.Scanner;
public class ScannerLearning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("The input number is: " + number);
    }
}
