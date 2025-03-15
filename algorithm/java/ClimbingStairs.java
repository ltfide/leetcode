/**
 * 70. Climbing Stairs
 * Diflty : Easy
 * URL    : https://leetcode.com/problems/climbing-stairs/
 * Date   : 15-03-2025
 * Author : Lutfi
 */
public class ClimbingStairs {
    
    static int climbStairs(int n) {
        if (n <= 1) return n;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2));  // 2
        System.out.println(climbStairs(8));  // 34
        System.out.println(climbStairs(45)); // 1836311903
    }
}
