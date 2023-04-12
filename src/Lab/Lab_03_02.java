package Lab;

public class Lab_03_02 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        System.out.println(intArr.length);
        int min = intArr[0];
        int max = intArr[0];
        for (int i = 0; i < intArr.length; i++) {

            if (intArr[i] < min) {

                min = intArr[i];

            } else if (intArr[i] > max) {
                max = intArr[i];
            }

        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}


