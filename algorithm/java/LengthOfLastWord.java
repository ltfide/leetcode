/**
 * 58. Length of Last Word
 * Diflty : Easy
 * URL    : https://leetcode.com/problems/length-of-last-word/
 * Date   : 15-03-2025
 * Author : Lutfi
 */
public class LengthOfLastWord {
    
    static int lengthOfLastWord(String s) {
        if (s.isEmpty()) return 0;

        s = s.trim();
        for (int i = s.length(); i > 0; i--) {
            if (s.charAt(i-1) == ' ') return s.length() - i;
        }

        return s.length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello world")); // 5
        System.out.println(lengthOfLastWord("hello world ")); // 5
    }
}
