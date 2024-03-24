/**
 * Remove Element
 * Diflty : Easy
 * URL    : https://leetcode.com/problems/remove-element/description/
 * Date   : 24-03-2024
 * Author : Lutfi
 */
public class RemoveElement {
    
    private static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            if (nums[i] == val) {
                nums[i] = nums[j];
                j--;
            } else {
                i++;
            }
        }

        return j + 1;
    }

    public static void main(String[] args) {
        int[] case1 = {3,2,2,3};
        int[] case2 = {0,1,2,2,3,0,4,2};

        Assert.isEquals(2, removeElement(case1, 3));
        Assert.isEquals(5, removeElement(case2, 2));
    }
}
