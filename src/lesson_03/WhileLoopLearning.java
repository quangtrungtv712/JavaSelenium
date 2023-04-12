package lesson_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class WhileLoopLearning {
    public static void main(String[] args) {
        /* game menu
         * 1. Ganerate random number < 1000
         * 0. Exit
         *
         * */
        boolean isCountinuing = true;
        while (isCountinuing) {
//            System.out.println("==============GAME MENU==================");
//            System.out.println("1. Ganerate random number < 1000");
//            System.out.println("0. Exit");

            printSimpleMenu();

            int option = getUserOptions();


            if (option == 0) {
                isCountinuing = false;
            } else if (option == 1) {
                System.out.println("Your random number: " + new SecureRandom().nextInt(1000));
            } else {
                System.out.println("[ERROR] WRONG INPUT");
            }
        }

//
//        boolean somethingIsStillTrue = true;
//
//        while (somethingIsStillTrue) {
//            somethingIsStillTrue = false;
//            System.out.println(somethingIsStillTrue);
//        }
//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
        //       }
    }

    private static void printSimpleMenu() {
        System.out.println("==============GAME MENU==================");
        System.out.println("1. Ganerate random number < 1000");
        System.out.println("0. Exit");
    }

    private static int getUserOptions() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please select option: ");
        return scanner.nextInt();
    }


}
