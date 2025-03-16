/**
 * 83. Remove Duplicates from Sorted List
 * Diflty : Easy
 * URL    : https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * Date   : 16-03-2025
 * Author : Lutfi
 */
public class RemoveDuplicatesArray {
    
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;};
    }

    static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (head != null) {
            if (head.val != current.val) {
                current.next = new ListNode(head.val);
                current = current.next;
            }
            head = head.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2)))); // 1,2
        deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2))))); // 1,2
    }
}
