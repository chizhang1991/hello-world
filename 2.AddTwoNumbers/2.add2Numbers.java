/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        ListNode res = new ListNode(0);
        ListNode cur = res;
        int carry = 0;
        int sum = 0;
        while(l1 != null || l2 != null) {
            if(l1 == null) {
                sum = carry + l2.val;
                l2 = l2.next;
            }
            else if(l2 == null) {
                sum = carry + l1.val;
                l1 = l1.next;
            }
            else {
                sum = carry + l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }
            if(sum > 9) {
                carry = 1;
                sum -= 10;
            }
            else {
                carry = 0;
            }
            cur.next = new ListNode(sum);
            cur = cur.next;
        }
        if(carry == 1) {
            cur.next = new ListNode(1);
        }
        return res.next;
    }
}