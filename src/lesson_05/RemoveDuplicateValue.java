package lesson_05;

import java.util.*;

public class RemoveDuplicateValue {
    // suy nghi cach giai quyet van de truoc, hoi lai nguoi ra de
    // xong r thi neu cach lam, ko nho cach nay thi noi cach khac vi du co collection, hashset, bla bla
    // Khi phong van thi nho neu xu ly van de roi moi code
    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<Integer>();

        myArrayList.add(1);
        myArrayList.add(5);
        myArrayList.add(7);
        myArrayList.add(3);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);

        List<Integer> withoutDuplicatedValuesList = new ArrayList<Integer>();
        for (Integer number : myArrayList) {
            if (!withoutDuplicatedValuesList.contains(number)) {
                withoutDuplicatedValuesList.add(number);
            }
        }


        System.out.println(myArrayList);

        Collections.sort(withoutDuplicatedValuesList);
        System.out.println(withoutDuplicatedValuesList);

        //Set<> set = new HashSet<>(); // SET thi loai bo duplicate va sap xep tang dan

        Set<Integer> set = new HashSet<>(myArrayList);
        myArrayList = new ArrayList<>(set);
        System.out.println("Set: " + myArrayList);


        //Sublist
        List<Integer> first3mnValues = withoutDuplicatedValuesList.subList(0,3);
        System.out.println(first3mnValues);
    }
}
