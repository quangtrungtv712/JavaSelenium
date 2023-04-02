package lesson_02;

public class BitwiseOperator {
    public static void main(String[] args) {
        if (firstMethod() && secondMethod()) ; // && thi ca 2 dieu dung moi chay het, neu first fail thi seceond ko chuay nua
        System.out.println("Inside the method");
    }

         public static boolean firstMethod() {
             System.out.println("firstMethod");
             return true;
         }
        public static boolean secondMethod() {
            System.out.println("secondMethod");
            return false;
        }
    }
