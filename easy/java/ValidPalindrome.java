/**
 * Valid Palindrome
 * Diflty : Easy
 * Date   : 19-02-2024
 * Author : Lutfi
 */
public class ValidPalindrome {
    
    /**
     * a = 97, z = 122
     * A = 65, Z = 90
     * 0 = 48, 9 = 57
     */
    private static boolean isPalindrome(String s) {
        StringBuilder s1 = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if ((ch >= 'a' && ch <= 'z')
                || (ch >= '0' && ch <= '9')) {
                s1.append(ch);
            }

            if (ch >= 'A' && ch <= 'Z') {
                s1.append((char) (ch + 32));
            }
        }

        // determine valid palindrome or not
        for (int i = 0; i < s1.length() / 2; i++) {
            if (s1.charAt(i) != s1.charAt(s1.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "0P";
        String s3 = "1P1";

        Assert.isTrue(isPalindrome(s1));
        Assert.isFalse(isPalindrome(s2));
        Assert.isTrue(isPalindrome(s3));
    }
}
