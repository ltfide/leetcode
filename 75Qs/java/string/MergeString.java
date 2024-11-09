/**
 * Author : Lutfi
 * Date   : 2024-11-10 02:59
 * Dflty  : Easy
 * Link   : https://leetcode.com/problems/merge-strings-alternately
 */
public class MergeString {

    private static String merge(String word1, String word2) {
        var merged = new StringBuilder();
        int minLen = Math.min(word1.length(), word2.length());

        for (int i = 0; i < minLen; i++) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(i));
        }

        if (word1.length() > word2.length()) {
            merged.append(word1.substring(minLen));
        } else {
            merged.append(word2.substring(minLen));
        }

        return merged.toString();
    }

    public static void main(String[] args) {
        System.out.println(merge("abc", "pqr")); // apbqcr
        System.out.println(merge("ab", "pqrs")); // apbqrs
        System.out.println(merge("abcd", "pq")); // apbqcd
    }
}