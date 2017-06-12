/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode smaller = new ListNode(0);
        ListNode smallerHead = smaller;
        ListNode larger = new ListNode(0);
        ListNode largerHead = larger;
        ListNode cur = head;
        while(cur != null) {
            if(cur.val < x) {
                smaller.next = cur;
                smaller = smaller.next;
            }
            else {
                larger.next = cur;
                larger = larger.next;
            }
            cur = cur.next;
        }
        larger.next = null;
        smaller.next = largerHead.next;
        return smallerHead.next;
    }
}