package lesson_06;

public class Calculator {

    //Method signature -- cung so luong, cung kieu du llieu, giong ten la giong nhau

    // method overloading
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

//    public int sum(int num1, int num2, int num3) {
//        return num1 + num2 + num3;
//    }

    // Varagrs | Rest Parameters
    public int sum(int num1, int num2, int... restNumbers) {
        int arrTotal = 0;
        for (int number : restNumbers) {
            arrTotal = arrTotal + number;
        }
        return arrTotal;
    }




    // when overloading happens | compile time -- trùng memothod name -- trùng parameter
    // when overriding happens | run time
    //
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1, 2));
        System.out.println(calculator.sum(1, 2, 3,4,5,6,7));
    }

}
