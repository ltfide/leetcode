/**
 * 2. Add Two Numbers
 * Diflty : Medium
 * URL    : https://leetcode.com/problems/add-two-numbers
 * Date   : 04-03-2025
 * Author : Lutfi
 * 
 * Example 1
 * input: l1 = [2,4,3], l2 = [5,6,4] 
 * output: [7,0,8]
 * Expl: 342 + 465 = 807
 * 
 * Example 2
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * 
 * Example 3
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * output: [8,9,9,9,0,0,0,1]
 *
 */
public class AddTwoNumbers {
    
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        addTwoNumbers(l1, l2);
    }
}
