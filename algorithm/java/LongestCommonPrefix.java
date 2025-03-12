/**
 * 14. Longest Common Prefix
 * Diflty : Easy
 * URL    : https://leetcode.com/problems/longest-common-prefix/
 * Date   : 12-03-2025
 * Author : Lutfi
 */ 
public class LongestCommonPrefix {

    static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] inp1 = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(inp1)); // fl

        String[] inp2 = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(inp2)); // ""

        String[] inp3 = {"d", "dog", "damkar"};
        System.out.println(longestCommonPrefix(inp3)); // d

        String[] inp4 = {"abab", "aba", ""};
        System.out.println(longestCommonPrefix(inp4)); // ""

        String[] inp5 = {"car", "cir"};
        System.out.println(longestCommonPrefix(inp5)); // c
    }
}
