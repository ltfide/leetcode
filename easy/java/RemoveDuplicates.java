/**
 * Remove Duplicates from Sorted List
 * Diflty : Easy
 * URL    : https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * Date   : 14-02-2024
 * Author : Lutfi
 */
public class RemoveDuplicates {
    
    /**
     * Example:
     * 1,1,2,3,3 => 1,2,3
     * 1,2,2,2,3 => 1,2,3
     */
    private static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        // can be done by only taking one pointer.
        ListNode prev = head, curr = head.next;

        while (curr != null) {
            if (prev.val == curr.val) {
                curr = curr.next;
                prev.next = curr;
            } else {
                prev = prev.next;
                curr = curr.next;
            }
        }
        return head;
    }

    private static ListNode createList(int... values) {
        if (values.length == 0) {
          return null;
        }
        
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        
        for (int i = 1; i < values.length; i++) {
          current.next = new ListNode(values[i]);
          current = current.next;
        }
        return head;
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = createList(1,1,2,3,3);
        printList(deleteDuplicates(head));
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}