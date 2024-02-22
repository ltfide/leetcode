/**
 * Single Number
 * Diflty : Easy
 * URL    : https://leetcode.com/problems/single-number
 * Date   : 22-02-2024
 * Author : Lutfi
 */
public class SingleNumber {
    
    /**
     * {4, 1, 2, 1, 1}
     * 0
     * 4
     * 5
     * 7
     * 6
     * 4
     */
    private static int singleNumber(int[] nums) {
        int r = 0;
        for (int n : nums) {
            r ^= n;
        }
        return r;
    }

    public static void main(String[] args) {
        int[] s1 = {4, 1, 2, 1, 2}; // 4
        System.out.println(singleNumber(s1));
    }
}
