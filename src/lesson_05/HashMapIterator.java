package lesson_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterator {
    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<Integer, String>(); // key la interger value la string
        emergencyList.put(113, "Canh Sat");
        emergencyList.put(114, "Cuu Hoa");
        emergencyList.put(115, "Cap Cuu");
        emergencyList.put(116, "Others");
        System.out.println(emergencyList.get(116));

        for(int key : emergencyList.keySet()) {
          //  if (emergencyList.get(key) == "Others") {
            if (emergencyList.get(key).equals("Others")) {
                emergencyList.replace(key, "Something new");
            }
        }
        for(int key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }
    }
}
