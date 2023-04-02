package lesson_02;

import java.util.Scanner;

public class IfStatement {
    private static boolean isHeOnTime;

    public static void main(String[] args) {
        final int EXPECTED_TIME = 7; //CONSANT THI DAT TEN VIET HOA, KHAI BAO  = FINAL
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter times: ");
        int arrivalTime = scanner.nextInt();

        boolean isHeOnTime = arrivalTime == EXPECTED_TIME;

        //boolean isHeOnTime = false;
        System.out.println("1. Going To the Shopping:");
        {
            if (isHeOnTime) {
                System.out.println("Let's Talk");
            } else {
                System.out.println("Write a letter");
            }
//            String outputMsg = isHeOnTime ? "Let's Talk" : "Write a letter";
//            System.out.println(outputMsg);
            System.out.println("Going Home");
        }
    }

}
