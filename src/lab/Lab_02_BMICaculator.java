package lab;

import java.util.Scanner;

public class Lab_02_BMICaculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your weight(kg): ");
        float weight = scanner.nextFloat();

        System.out.print("Please enter your heights(m): ");
        float height = scanner.nextFloat();

        float BMICaculator = weight / (height * height);
        System.out.println("Your BMI = " + BMICaculator);

        if (BMICaculator < 18.5) {
            System.out.println("You are underweight. You should try to gain weight " + ((18.5 * height * height) - weight) + "kg");
        } else if (BMICaculator < 25) {
            System.out.println("Your weight is within the healthy range for your height ");
        } else if (BMICaculator < 30) {
            System.out.println("You are overweight. You should try to lose weight " + (weight - (24.9 * height * height)) + " kg");
        } else {
            System.out.println("You are obese. You should try to lose weight ASAP.");
        }
    }
}



