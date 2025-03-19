/**
 * 203. Remove Linked List Elements
 * Diflty : Easy
 * URL    : https://leetcode.com/problems/remove-linked-list-elements/
 * Date   : 19-03-2025
 * Author : Lutfi
 */
public class RemoveLinkedList {
    
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
    }

    static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (head != null) {
            if (head.val != val) {
                current.next = new ListNode(head.val);
                current = current.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}
