package challenge_4;

public class Solution {

    public static String findLongestSubstringPalindrome(String s) {
        int low, high;
        int strLen = s.length();
        int start = 0;
        int maxLength = 1;

        for (int i = 1; i < strLen; i++) {
            low = i - 1;
            high = i;

            //find longest even length palindromes
            while (low >= 0 && high < strLen && s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                low--;
                high++;
            }

            low = i - 1;
            high = i + 1;

            //find longest odd length palindromes
            while (low >= 0 && high < strLen && s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                low--;
                high++;
            }
        }

        return s.substring(start, start + maxLength);
    }
}
