package challenge_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {

    public static List<Integer> addTwoNumbers(List<Integer> l1, List<Integer> l2) {
        List<Integer> result = new ArrayList<>();
        if (l1.size() == 0 && l2.size() == 0) {
            result.add(0);
            return result;
        }

        Iterator<Integer> it1 = l1.iterator();
        Iterator<Integer> it2 = l2.iterator();
        int c = 0;
        while (it1.hasNext() || it2.hasNext()) {
            if (it1.hasNext() && it2.hasNext()) {
                int sum = it1.next() + it2.next() + c;
                c = sum / 10;
                int remainder = sum % 10;

                result.add(remainder);
            } else if (it1.hasNext()) {
                result.add(it1.next() + c);
                c = 0;
            } else {
                result.add(it2.next() + c);
                c = 0;
            }
        }
        if (c == 1) {
            result.add(c);
        }

        return result;
    }

    public static void printList(List<Integer> list) {
        if (list != null) {
            for (int n : list) {
                System.out.print(n + " ");
            }
        }
    }
}
