package lab;

import java.util.Scanner;

public class Lab_06_03 {
    public static void main(String[] args) {

        String myStr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input your string (include both characters and numbers): ");
        myStr = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (char c : myStr.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                break;
            }
        }

        String output = sb.toString();
        System.out.println("Your number here: " + output);


        String myStr2 = "100 minutes";
        String output2 = myStr2.replaceAll("[^0-9]", "");
        System.out.println("Your number here: " + output2);

    }
}
