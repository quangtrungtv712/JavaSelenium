package lesson_04;

import java.security.SecureRandom;

public class FunctionLearning {
//    public static void main(String[] args) {
//        sayHello("Teo"); // "teo" : argument
//        sayHello("Tun");
//        sayHello("Ti");
//
//    }
//
//    public static void sayHello(String name) {
//        System.out.println("Hi " + name);
//
//    }

    public static void main(String[] args) {
        System.out.println(getARandomNumber(2));
        System.out.println(getARandomNumber(10));
        printNumber();
    }
    public static int getARandomNumber(int boundary) {
        int randomNumber = new SecureRandom().nextInt(boundary);
        return randomNumber;

    }

    public static void printNumber() {
        for (int i = 0; i < 10; i++) {
            if (i == 8){
                System.out.println("You have reached the magic number ");
                return;
        }
        else System.out.println(i);
    }
        System.out.println("End the program");
    }


}
