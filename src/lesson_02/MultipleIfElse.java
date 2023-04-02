package lesson_02;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        // < 18 || 18 - 55 || 56
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Duoi 18 - Khong ban");
            if (age < 14)
                System.out.println("Goi canh sat");
        } else if (age <= 55)
            System.out.println("Thich mua nhieu mua");
        else {
            System.out.println("Ban 2 chai");
        }

        //&& la va thi ca 2 dung thi moi dung - || nay la hoac - thi 1 trong 2 thang dung la ok
    }
}
