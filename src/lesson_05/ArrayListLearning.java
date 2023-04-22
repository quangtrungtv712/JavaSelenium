package lesson_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {

    public static void main(String[] args) {
        List<Integer> myArrayList = Arrays.asList(1, 2, 3, 4); // khai báo array như này thì không add hay remove duoc,, update thi duoc
        List<Integer> myArrayList2 = new ArrayList<Integer>();
        myArrayList2.add(1);
        myArrayList2.add(2);
        myArrayList2.add(3);
        myArrayList2.add(4);

//        for (int i = 0; i < myArrayList.size(); i++) {
//            boolean isElementOddNumber = myArrayList.get(i) % 2 != 0;
//            if (isElementOddNumber) {
//                myArrayList.set(i, myArrayList.get(i) + 1);
//            }
//
//        }

//        myArrayList2.remove(1); // remove index so 1
//        myArrayList2.remove(new Integer(1)); // remove mang gia tri so 1


        System.out.println(myArrayList);
        System.out.println(myArrayList2);

        //CRUD operations
        if (myArrayList.isEmpty()) {
            System.out.println("List Size: " + myArrayList.size());
        }
    }
}
