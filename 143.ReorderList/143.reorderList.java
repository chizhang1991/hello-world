/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        ListNode head1 = head;
        // ListNode head2 = new ListNode(0);
        ListNode slow = head;
        ListNode fast = head.next;
        // find mid by two pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        // reverse the second list
        ListNode pre = null;
        ListNode cur = head2;
        // ListNode nex = head2.next;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        head2 = pre;
        // merge two list
        ListNode cur1 = head;
        ListNode cur2 = head2;
        while (cur1 != null && cur2 != null) {
            ListNode temp1 = cur1.next;
            cur1.next = cur2;
            cur1 = temp1;
            ListNode temp2 = cur2.next;
            cur2.next = cur1;
            cur2 = temp2;
        }
    }
}