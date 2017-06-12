/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode pre = head;
        if (pre == null) {
            return head;
        }
        ListNode cur = head.next;
        if (cur == null) {
            return head;
        }
        ListNode updateHead = cur;
        ListNode temp;
        while ((cur.next != null) && (cur.next.next != null)) {
            temp = cur.next;
            pre.next = cur.next.next;
            cur.next = pre;
            cur = pre.next;
            pre = temp;
        }
        if (cur.next != null) {
            temp = cur.next;
            pre.next = cur.next;
            cur.next = pre;
            pre.next.next = null;
        }
        else {
            cur.next = pre;
            pre.next = null;
        }
        return updateHead;
    }
}