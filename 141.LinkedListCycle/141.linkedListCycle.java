/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode cur1 = head;
        ListNode cur2 = head;
        if ((head == null) || (head.next == null)) {
            return false;
        }
        cur1 = cur1.next;
        cur2 = cur2.next.next;
        
        while ((cur2 != null) && (cur1 != null)) {
            if (cur1 == cur2) {
                return true;
            }
            else {
                cur1 = cur1.next;
                if (cur2.next != null) {
                    cur2 = cur2.next.next;
                }
                else {
                    return false;
                }
            }
        }
        return false;
    }
}