import java.util.*;

public class Hashing {

    public static void main(String args[]) {
        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int len = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum)) {
                len = Math.max(len, j - map.get(sum));
            } else {
                map.put(sum, j);
            }
            System.out.println("  " + len);
        }

        // HashSet iteration
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        // iterator loop method
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Union and Intersection of two arrays
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 5, 7, 8, 10 };
        HashSet<Integer> set = new HashSet<>();

        // function for union
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        // Intersection
        set.clear();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println("Intersection count: " + count);

        // HashSet functions
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(4);
        hashSet.add(3);

        System.out.println(hashSet);
        hashSet.remove(1);
        System.out.println(hashSet.isEmpty());

        if (hashSet.contains(1)) {
            System.out.println("HashSet contains 1");
        }

        // Create a HashMap
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("INDONESIA", 6);
        hm.put("Nepal", 6);

        // Iteration
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        // foreach loop for iteration
        for (String k : keys) {
            System.out.println("keys =" + k + ", value = " + hm.get(k));
        }

        // Insert into HashMap
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        System.out.println(hm);

        // Get function
        int population = hm.get("India");
        System.out.println("Population of India: " + population);

        // Contains function
        System.out.println("Contains Key India: " + hm.containsKey("India"));

        // Remove function
        System.out.println("Removed: " + hm.remove("China"));
    }
}
