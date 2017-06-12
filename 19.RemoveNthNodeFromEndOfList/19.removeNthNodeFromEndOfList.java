/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode cur = head;
        while (cur != null) {
            count ++;
            cur = cur.next;
        }
        count = count - n;
        if (count == 0) {
            head = head.next;
            return head;
        }
        cur = head;
        for (int i = 1; i < count; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;
    }
}

// two pointers
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // two pointers
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode slow = head;
        ListNode fast = head;
        // fast and slow gap: n
        for (int i = 0; i < n; i++) {
            // if (fast == null) {
            //     return null;
            // }
            fast = fast.next;
        }
        while (fast != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next;
        }
        pre.next = slow.next;
        return dummy.next;
    }
}