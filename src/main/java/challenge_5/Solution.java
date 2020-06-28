package challenge_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {

    public static List<String> findAutocompleteWords(String[] words, String prefix) {
        Node current = buildTrie(words);
        for (Character ch : prefix.toCharArray()) {
            Map<Character, Node> children = current.getChildren();
            if (!current.getChildren().containsKey(ch)) {
                return null;
            }
            current = children.get(ch);
        }
        return findWordsFromNode(current, prefix);
    }

    private static List<String> findWordsFromNode(Node node, String prefix) {
        List<String> words = new ArrayList<>();

        if (node.isWord()) {
            words.add(prefix);
        }
        for (Character ch : node.getChildren().keySet()) {
            words.addAll(findWordsFromNode(node.getChildren().get(ch), prefix + ch));
        }

        return words;
    }

    private static Node buildTrie(String[] words) {
        Node trie = new Node();
        for (String word : words) {
            Node current = trie;
            for (char ch : word.toCharArray()) {
                if (!current.getChildren().containsKey(ch)) {
                    Node newNode = new Node();
                    current.getChildren().put(ch, newNode);
                }
                current = current.getChildren().get(ch);
            }
            current.setIsWord(true);
        }

        return trie;
    }
}
