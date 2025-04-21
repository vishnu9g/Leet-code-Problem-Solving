import java.util.*;

class Solution {
    public int countWords(String[] w1, String[] w2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for (String word : w1) {
            map1.put(word, map1.getOrDefault(word, 0) + 1);
        }

        for (String word : w2) {
            map2.put(word, map2.getOrDefault(word, 0) + 1);
        }

        int count = 0;
        for (String word : map1.keySet()) {
            if (map1.get(word) == 1 && map2.getOrDefault(word, 0) == 1) {
                count++;
            }
        }

        return count;
    }
}
