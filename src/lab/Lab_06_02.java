package lab;

import java.util.Scanner;

public class Lab_06_02 {
    public static void main(String[] args) {

        String myPassword = "password123";
        int maxInput = 3;
        int inputCount = 0;

        while (inputCount < maxInput) {

            System.out.print("Please enter your password: ");
            Scanner scanner = new Scanner(System.in);
            String inputPassword = scanner.nextLine();

            if (!inputPassword.equals(myPassword)) {
                inputCount++;
                System.out.println("Incorrect password. Please try again.");
            } else {
                System.out.println("Congratulations! You have entered the correct password.");
                break;
            }
        }

        if (inputCount >= maxInput) {
            System.out.println("You have exceeded the maximum number of attempts. Please contact customer support.");
        }

    }
}
