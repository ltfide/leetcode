/**
 * 125. Valid Palindrome
 * Diflty : Easy
 * URL    : https://leetcode.com/problems/valid-palindrome/
 * Date   : 18-03-2025
 * Author : Lutfi
 */
public class ValidPalindrome {
    
    static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (left < right && Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama"); // true
        isPalindrome("race a car"); // false
        isPalindrome(" "); // true
        isPalindrome("0P"); // false
    }
}
