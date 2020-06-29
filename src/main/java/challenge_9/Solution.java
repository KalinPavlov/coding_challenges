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
        for (char ch : s.toCharArray()) {
            if (openingBrackets.contains(ch)) {
                brackets.push(ch);
            }

            if (closingBrackets.contains(ch)) {
                char openingBracket = brackets.pop();
                if (!(getClosingFromOpeningBracket(openingBracket) == ch)) {
                    return false;
                }
            }
        }

        return brackets.empty();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString("123456".split("[0-9]")));
    }
}
