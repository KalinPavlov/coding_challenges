package challenge_9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import static challenge_9.Brackets.*;

public class Solution {
    private final static Set<Character> openingBrackets = new HashSet<>();
    private final static Set<Character> closingBrackets = new HashSet<>();

    static {
        openingBrackets.add(PARENTHESES.getOpeningBracket());
        openingBrackets.add(SQUARE.getOpeningBracket());
        openingBrackets.add(CURLY.getOpeningBracket());

        closingBrackets.add(PARENTHESES.getClosingBracket());
        closingBrackets.add(SQUARE.getClosingBracket());
        closingBrackets.add(CURLY.getClosingBracket());
    }

    public static boolean isValid(String s) {
        final Stack<Character> brackets = new Stack<>();
        for (char ch : s.toCharArray()) { // n
            if (openingBrackets.contains(ch)) { // 1
                brackets.push(ch); // 1
            }

            if (closingBrackets.contains(ch)) { // 1
                char openingBracket = brackets.pop(); // 1
                if (!(getClosingFromOpeningBracket(openingBracket) == ch)) { // 1
                    return false; // 1
                }
            }
        }

        return brackets.empty(); // 1

        // O(n)
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString("123456".split("[0-9]")));
    }
}
