package subsetArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        System.out.println("Subsequences of 'abc':");
        System.out.println(subseqList("", "abc"));

    }
    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);

            return;
        }
        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1)); // Include the character
        subseq(p, up.substring(1)); // Exclude the character
    }

    static ArrayList<String> subseqList(String p, String up) {
        if (up.isEmpty()) {

            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = subseqList(p + ch, up.substring(1)); // Include the character
        ArrayList<String> right = subseqList(p, up.substring(1)); // Exclude the character

        left.addAll(right); // Combine both lists
        return left;
    }
}
