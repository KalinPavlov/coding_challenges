package challenge_3;

import java.util.*;

public class Solution {

    public static OptionalInt findLongestSubstringNoDuplicateChars(String input) {
        char[] charArray = input.toCharArray();

        Map<Character, Integer> visited = new HashMap<>();
        List<Integer> uniqueSubStringLengths = new ArrayList<>();
        int bestLength = 0;
        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            if (!visited.containsKey(currentChar)) {
                visited.put(currentChar, i);
                bestLength++;
            } else {
                uniqueSubStringLengths.add(bestLength);
                bestLength = 1;
                visited.clear();
                visited.put(currentChar, i);
            }
        }

        return uniqueSubStringLengths.stream().mapToInt(Integer::intValue).max();
    }
}
