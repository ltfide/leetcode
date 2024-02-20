/**
 * Search Insert Position
 * Diflty : Easy
 * Date   : 20-02-2024
 * Author : Lutfi
 */
public class SearchInsertPosition {

    /**
     * n: 1,2,5,6 t: 2 => 1
     * n: 1,2,5,6 t: 5 => 2
     * n: 1,2,5,6 t: 7 => 4
     */
    private static int searchInsert(int[] nums, int target) {
        int p = 0;

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) return i;
            if (target > nums[i]) p = i + 1;
        }
        
        return p;
    }

    public static void main(String[] args) {
        int[] s1 = {1,3,5,6};
        int t1 = 7;
    
        System.out.println(searchInsert(s1, t1));
    }
}
