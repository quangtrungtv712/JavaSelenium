package lesson_04;

import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int userInput = scanner.nextInt();

        switch (userInput){
            case 1:
                System.out.println("Giai Nhat");
                break;
            case 2:
                System.out.println("Giai Nhi");
                break;
            case 3:
                System.out.println("Giai Ba");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Nhap sai roi");
                break;
            default:
                System.out.println("Chuc ban may man lan sau");
        }

    }
}
