package lesson_03;

public class Lab_03_02 {
    public static void main(String[] args) {
        int [] intArr = {12, 34, 1, 16, 28};
        int [] intArrSort = {};
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] < i++) {
                intArrSort[i] = intArr[i];
                System.out.println(intArrSort);
            } else {
                System.out.println("AI BIET GI DAU");
            }
        }

    }
}


