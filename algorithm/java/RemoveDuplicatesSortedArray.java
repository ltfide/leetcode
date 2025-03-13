/**
 * 26. Remove Duplicates from Sorted Array
 * Diflty : Easy
 * URL    : https://leetcode.com/problems/remove-duplicates-from-sorted-array
 * Date   : 13-03-2025
 * Author : Lutfi
 */ 
public class RemoveDuplicatesSortedArray {
    
    static int removeDuplicates(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                nums[++k] = nums[i];
            }
        }

        return k + 1;
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{1,1,2}); // 2
        removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}); // 5
    }
}
