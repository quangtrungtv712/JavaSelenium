package lesson_05;

import java.util.HashMap;
import java.util.Map;

//HashMapLearning va ArrayList la hay dung trong automation
public class HashMapLearning {
    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<Integer, String>(); // key la interger value la string
        emergencyList.put(113, "Canh Sat");
        emergencyList.put(114, "Cuu Hoa");
        emergencyList.put(115, "Cap Cuu");
        emergencyList.put(116, "Others");
        System.out.println(emergencyList.get(116));

        System.out.println(emergencyList.get(113));
        emergencyList.put(116, "Something else");
        System.out.println(emergencyList.get(116));
        System.out.println(emergencyList.get(117)); // lay value ko co lay defaut


        for (int key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }
//        System.out.println("have 113 key: " + emergencyList.containsKey(113));
//        System.out.println("have 116 key: " + emergencyList.containsKey(116));
//        System.out.println("have value : " + emergencyList.containsValue("Cap Cuu"));
//        System.out.println("have value : " + emergencyList.containsValue("Cap Cuu "));

        // update
        emergencyList.replace(116, "116");
        System.out.println(emergencyList.get(116));

        emergencyList.replace(116, "116", "Something new");
        System.out.println(emergencyList.get(116));

        emergencyList.replace(116, "116 ", "Something new");
        System.out.println(emergencyList.get(116));
    }


}
