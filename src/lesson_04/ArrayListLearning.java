package lesson_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {

        List<Integer> myArrayList = new ArrayList<Integer>(); // khuyen dung list array nay

        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(0, 3);

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));

        }


        //List<Integer> myList = Arrays.asList(1,2,3,3); // hoac list nay

         //ArrayList <Integer> myArrayList = new ArrayList<>();  // nen dung loai nay khai bao luon data type
        // myArrayList.add(0);


//        ArrayList myArrayList = new ArrayList();
//        myArrayList.add(0);
//        myArrayList.add(false);
//        myArrayList.add(1.8f);
//        myArrayList.add(1.8d);
//        myArrayList.add(5L);
//        myArrayList.add("Teo");



    }


}
