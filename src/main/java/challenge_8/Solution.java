package challenge_8;

import java.util.*;

public class Solution {

    public static List<String> findAllConcatenationWords(final String[] words) {
        final Set<String> wordDict = new HashSet<>();
        Collections.addAll(wordDict, words);

        Map<String, Boolean> cache = new HashMap<>();
        List<String> result = new ArrayList<>();
        Arrays.stream(words).forEach(w -> {
            if (canForm(w, wordDict, cache)) {
                result.add(w);
            }
        });

        return result;
    }

    private static boolean canForm(String word, Set<String> wordDict, Map<String, Boolean> cache) {
        if (cache.containsKey(word)) {
            return cache.get(word);
        }
        for (int index = 1; index < word.length(); index++) {
            String prefix = word.substring(0, index);
            String suffix = word.substring(index);

            if (wordDict.contains(prefix)) {
                if (wordDict.contains(suffix) || canForm(suffix, wordDict, cache)) {
                    cache.put(word, true);
                    return true;
                }
            }
        }
        return false;
    }
}
