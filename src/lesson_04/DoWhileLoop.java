package lesson_04;

import java.awt.*;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int userGuessing = 0;
        int randomNumber = new SecureRandom().nextInt(5);
        System.out.println(randomNumber);


        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter guessing number: ");
            int userInput = scanner.nextInt();

            if (userInput == randomNumber) {
                System.out.println("You are winner");
                break;
            }
            userGuessing++;
        }

        while (userGuessing < 3);

        System.out.println("See you again");

    }
}