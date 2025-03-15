/**
 * 35. Search Insert Position
 * Diflty : Easy
 * URL    : https://leetcode.com/problems/search-insert-position/
 * Date   : 15-03-2025
 * Author : Lutfi
 */
public class SearchInsertPosition {
    
    static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
            if (nums[i] > target) return i;
        }
        return nums.length;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 5)); // 2
        System.out.println(searchInsert(new int[]{1,3,5,6}, 2)); // 1
        System.out.println(searchInsert(new int[]{1,3,5,6}, 7)); // 4
    }
}
