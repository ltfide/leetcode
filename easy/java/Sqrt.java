/**
 * Sqrt(x)
 * Diflty : Easy
 * URL    : https://leetcode.com/problems/sqrtx
 * Date   : 24-02-2024
 * Author : Lutfi
 */
public class Sqrt {
    
    private static int mySqrt(int x) {
        if (x == 0) return 0;

        int left = 1;
        int right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
                // Found the integer square root
                return mid;
            } else if (mid > x / mid) {
                // Mid is too large, adjust the range to the left
                right = mid - 1;
            } else {
                // Mid is too small, adjust the range to the right
                left = mid + 1;
            }
        }

        return -1; // This should not happen for a non-negative integer input
    }

    public static void main(String[] args) {
        int x = 2147483647;
        int x1 = 4;
        Assert.isEquals(46340, mySqrt(x));
        Assert.isEquals(2, mySqrt(x1));
    }
}
