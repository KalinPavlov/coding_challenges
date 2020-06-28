package challenge_5;

import java.util.HashMap;
import java.util.Map;

public class Node {
    private final Map<Character, Node> children = new HashMap<>();
    private boolean isWord;

    public void setIsWord(boolean isWord) {
        this.isWord = isWord;
    }

    public Map<Character, Node> getChildren() {
        return children;
    }

    public boolean isWord() {
        return isWord;
    }
}
