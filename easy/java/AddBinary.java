/**
 * Add Binary
 * Diflty : Easy
 * URL    : https://leetcode.com/problems/add-binary
 * Date   : 22-02-2024
 * Author : Lutfi
 */
public class AddBinary {
    
    private static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int bitA = (i >= 0) ? Character.getNumericValue(a.charAt(i)) : 0;
            int bitB = (j >= 0) ? Character.getNumericValue(b.charAt(j)) : 0;

            int sum = bitA + bitB + carry;
            result.insert(0, sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("10", "0"));
    }
}
