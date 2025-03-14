/**
 * 28. Find the Index of the First Occurrence in a String
 * Diflty : Easy
 * URL    : https://leetcode.com/problems/remove-duplicates-from-sorted-array
 * Date   : 14-03-2025
 * Author : Lutfi
 */
public class FindIndexFirstString {
    
    static int strStr(String haystack, String noddle) {
        if (haystack == null || haystack.isEmpty()) return -1;

        int k = 0;
        while (!haystack.startsWith(noddle)) {
            haystack = haystack.substring(1);
            if (haystack.isEmpty()) return -1;
            k++;
        }
        return k;
    }

    public static void main(String[] args) {
        strStr("sadbutsad", "sad"); // 0
        strStr("hello", "ll"); // 2
        strStr("abc", ""); // 0
        strStr("leetcode", "leeto"); // -1
    }
}
