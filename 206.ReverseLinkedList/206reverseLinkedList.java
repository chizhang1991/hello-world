/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        
        ListNode current = head;
        ListNode newNext = null;
        ListNode newCurrent = null;
        
        while(current != null) {
            //newCurrent = current;
            newCurrent = current.next;
            //newCurrent.next = newNext;
            current.next = newNext;
            newNext = current;
            //current = current.next;
            current = newCurrent;
        }
        return newNext;
    }
}