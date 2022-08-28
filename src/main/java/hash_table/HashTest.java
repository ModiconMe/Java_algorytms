package hash_table;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashTest {
    public static void main(String[] args) {
        Map<String, Integer> stringMap = new HashMap();
        stringMap.put("Orange", 70);
        stringMap.put("Milk", 45);
        stringMap.put("Avocado", 100);


        System.out.println(stringMap.get("Milk"));

        System.out.println(stringMap.keySet());
        System.out.println(stringMap.values());
        stringMap.put("Avocado", 75);
        System.out.println(stringMap.keySet());
        System.out.println(stringMap.values());

        Set<String> stringSet = new HashSet<>();

        stringSet.add("Orange");
        stringSet.add("Milk");
        stringSet.add("Avocado");

        System.out.println(stringSet.toString());

    }
}
