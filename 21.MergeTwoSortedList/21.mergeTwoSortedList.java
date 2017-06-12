/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head;
        ListNode cur;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            head = l1;
            cur = l1;
            cur1 = cur1.next;
        }
        else {
            head = l2;
            cur = l2;
            cur2 = cur2.next;
        }
        while ((cur1 != null) && (cur2 != null)) {
            if (cur1.val < cur2.val) {
                cur.next = cur1;
                cur = cur.next;
                cur1 = cur1.next;
            }
            else {
                cur.next = cur2;
                cur = cur.next;
                cur2 = cur2.next;
            }
        }
        if (cur1 == null) {
            cur.next = cur2;
        }
        else {
            cur.next = cur1;
        }
        
        return head;
    }
}