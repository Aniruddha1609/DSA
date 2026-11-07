import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        // * Hashset */
        // HashSet<Integer> set = new HashSet<>();

        // set.add(1);
        // set.add(20);
        // set.add(62);

        // if (set.contains(1)) {
        // System.out.println("Present");
        // }

        // set.remove(1); // removing an element
        // System.out.println(set.size()); // size of a set

        // Iterator<Integer> it = set.iterator();

        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }

        // System.out.println(set);

        // HashMap<String, Integer> map = new HashMap<>();
        // map.put("India", 120);
        // map.put("Usa", 30);
        // map.put("China", 150);

        // System.out.println(map);

        // // Search:

        // if (map.containsKey("India")) {
        // System.out.println("Key is present");
        // }

        // map.get("China");

        // * Occurance of number in a array*/

        int arr[] = { 1, 2, 3, 4, 2, 3, 1, 2 };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : arr) {
            Integer occurance = map.get(val);
            map.put(val, occurance == null ? 1 : occurance + 1);
        }

        System.out.println(map);
    }
}
