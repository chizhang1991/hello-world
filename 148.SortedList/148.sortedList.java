/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // merge sort
        ListNode mid = findMid(head);
        ListNode right = sortList(mid.next);
        // disconnect left & right part of the list
        mid.next = null;
        ListNode left = sortList(head);
        return merge(left, right);
    }
    private ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next; // fast cannot be head
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    private ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                cur.next = head1;
                cur = cur.next;
                head1 = head1.next;
            } else {
                cur.next = head2;
                cur = cur.next;
                head2 = head2.next;
            }
        }
        if (head1 != null) {
            cur.next = head1;
        } else {
            cur.next = head2;
        }
        return dummy.next;
    }
}