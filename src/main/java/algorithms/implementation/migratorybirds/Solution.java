package algorithms.implementation.migratorybirds;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        System.out.println(migratoryBirds(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
    }

    static int migratoryBirds(List<Integer> arr) {
        final List<Integer> keys = arr.stream()
                .distinct()
                .collect(Collectors.toList());
        final Map<Integer, Integer> map = new TreeMap<>();
        keys.forEach(key -> map.put(key, (int) arr.stream()
                .filter(i -> i.equals(key)).count()));
        final Optional<Map.Entry<Integer, Integer>> maxValueEntry = map.entrySet()
                .stream()
                .max(Comparator.comparingInt(Map.Entry::getValue));
        final int maxValue = maxValueEntry.isPresent() ? maxValueEntry.get().getValue() : 0;
        final Optional<Map.Entry<Integer, Integer>> minIdValue = map.entrySet()
                .stream()
                .filter(e -> e.getValue() == maxValue).min(Comparator.comparingInt(Map.Entry::getKey));
        return minIdValue.isPresent() ? minIdValue.get().getKey() : 0;
    }
}
