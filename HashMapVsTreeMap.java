import java.util.*;

public class HashMapVsTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Banana");
        hashMap.put(1, "Apple");
        hashMap.put(null, "NullKey"); // Allowed
        hashMap.put(2, null);         // Null value allowed

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Banana");
        treeMap.put(1, "Apple");
        // treeMap.put(null, "NullKey"); // Not allowed
        treeMap.put(2, null);          // Null value allowed

        System.out.println("HashMap (unordered): " + hashMap);
        System.out.println("TreeMap (sorted by keys): " + treeMap);
    }
}
