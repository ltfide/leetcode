/**
 * 21. Merge Two Sorted Lists
 * Diflty : Easy
 * URL    : https://leetcode.com/problems/merge-two-sorted-lists
 * Date   : 06-03-2025
 * Author : Lutfi
 */
public class MergeTwoSortedLists {
    
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-100);
        ListNode current = head;

        while (list1 != null || list2 != null) {
            if (list1 != null) {
                if (current.val > list1.val) {
                    int v = current.val;
                    current.val = list1.val;
                    list1.val = v;
                }
                current.next = new ListNode(list1.val);
                current = current.next;
                list1 = list1.next;                
            }

            if (list2 != null) {
                if (current.val > list2.val) {
                    int v = current.val;
                    current.val = list2.val;
                    list2.val = v;
                }
                current.next = new ListNode(list2.val);
                current = current.next;
                list2 = list2.next;
            }
        }

        ListNode x = head.next;
        while (x != null) {
            System.out.println(x.val);
            x = x.next;
        }

        return new ListNode();
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        //mergeTwoLists(l1, l2);

        ListNode l3 = new ListNode();
        ListNode l4 = new ListNode(0);
        //mergeTwoLists(l3, l4);

        ListNode l5 = new ListNode(2);
        ListNode l6 = new ListNode(1);
        //mergeTwoLists(l5, l6);

        ListNode l7 = new ListNode(1);
        ListNode l8 = null;
        //mergeTwoLists(l7, l8);

        ListNode l9  = new ListNode(5);
        ListNode l10 = new ListNode(1, new ListNode(2, new ListNode(4)));
        //mergeTwoLists(l9, l10);

        ListNode l11 = new ListNode(-9, new ListNode(3));
        ListNode l12 = new ListNode(5, new ListNode(7));
        mergeTwoLists(l11, l12);
    }
}
