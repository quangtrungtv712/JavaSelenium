package lesson_03;

public class ArrayLearning {
    public static void main(String[] args) {
        int arrayLength = 5;
        int[] myIntArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            myIntArray[i] = i + 1;
        }


//        myIntArray[0] = 1;
//        myIntArray[1] = 2;
//        myIntArray[2] = 3;
//        myIntArray[3] = 4;
//        myIntArray[4] = 5;
//
        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("Element at the index %d have value %d\n", i, myIntArray[i]);
//          System.out.println(myIntArray[i]);
        }
        // enhanced for loop
        for (int arrayElement : myIntArray) {
            System.out.println(arrayElement);

        }

    }
}
//int [] myIntArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


