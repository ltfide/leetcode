/**
 * 69. Sqrt(x)
 * Diflty : Easy
 * URL    : https://leetcode.com/problems/sqrtx/
 * Date   : 15-03-2025
 * Author : Lutfi
 */
public class Sqrt {
    
    static int mySqrt(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;

        long left = 1;
        long right = x;
        long result = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid <= x) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647)); // 46340
        System.out.println(mySqrt(25)); // 3
        System.out.println(mySqrt(9));  // 2
        System.out.println(mySqrt(6));  // 2
        System.out.println(mySqrt(5));  // 2
        System.out.println(mySqrt(4));  // 2
        System.out.println(mySqrt(3));  // 1
        System.out.println(mySqrt(2));  // 1
    }
}
