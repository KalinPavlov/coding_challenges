package challenge_3;

import java.util.*;

public class Solution {

    public static OptionalInt findLongestSubstringNoDuplicateChars(String input) {
        char[] charArray = input.toCharArray();

        Map<Character, Integer> visited = new HashMap<>();
        List<StringBuffer> uniqueSubStrings = new ArrayList<>();
        StringBuffer bestResult = new StringBuffer();
        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            if (!visited.containsKey(currentChar)) {
                visited.put(currentChar, i);
                bestResult.append(currentChar);
            } else {
                uniqueSubStrings.add(bestResult);
                bestResult = new StringBuffer();
                bestResult.append(currentChar);
                visited.clear();
                visited.put(currentChar, i);
            }
        }

        return uniqueSubStrings.stream().mapToInt(StringBuffer::length).max();
    }
}
