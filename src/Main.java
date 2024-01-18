import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of each value in the array
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Check if the number of occurrences is unique
        Set<Integer> occurrenceSet = new HashSet<>(countMap.values());
        return countMap.size() == occurrenceSet.size();
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(arr1)); // Output: true

        // Example 2
        int[] arr2 = {1, 2};
        System.out.println(uniqueOccurrences(arr2)); // Output: false

        // Example 3
        int[] arr3 = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        System.out.println(uniqueOccurrences(arr3)); // Output: true
    }
}
