/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode cur1 = head;
        ListNode cur2 = head;
        
        if((head == null) || (head.next == null)) {
            return true;
        }
        
        while((cur2 != null) && (cur2.next != null)) {
            cur1 = cur1.next;
            cur2 = cur2.next.next;
        }
        
        //reverse from cur1
        ListNode head2 = reverse(cur1);
        
        cur1 = head;
        cur2 = head2;
        while(cur2 != null) {
            if (cur1.val != cur2.val) {
                return false;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        
        return true;
    }
    
    private ListNode reverse (ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode nex;
        while (cur != null) {
            nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
        }
        return pre;
    }
}