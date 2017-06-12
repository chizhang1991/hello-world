/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0;
        int lengthB = 0;
        ListNode currentA = headA;
        ListNode currentB = headB;
        // find the length of A and B
        while (currentA != null) {
            lengthA++;
            currentA = currentA.next;
        }
        currentA = headA;
        while (currentB != null) {
            lengthB++;
            currentB = currentB.next;
        }
        currentB = headB;
        
        int delta = lengthA - lengthB;
        if (delta >= 0) {
            for (int i = 0; i < delta; i++) {
                currentA = currentA.next;
            }
        }
        else {
            for(int i = 0; i < (-delta); i++) {
                currentB = currentB.next;
            }
        }
        // find the insertion node
        while(currentA != currentB) {
            currentA = currentA.next;
            currentB = currentB.next;
        }
        if (currentA == null) {
            return null;
        }
        else {
            return currentA;
        }
    }
}