package challenge_17;

public class Solution {

    public static void invertRec(Node node) {
        if (node == null) {
            return;
        }

        Node temp = node.getLeft();
        node.setLeft(node.getRight());
        node.setRight(temp);

        invertRec(node.getLeft());
        invertRec(node.getRight());
    }
}
