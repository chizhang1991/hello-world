/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    private ListNode head;
    private Random rdm;

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        this.head = head;
        rdm = new Random();
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        ListNode count = head;
        int size = 0;
        while(count != null) {
            count = count.next;
            size++;
        }
        ListNode cur = head;
        int i = rdm.nextInt(size);
        for (int j = 0; j < i; j++) {
            cur = cur.next;
        }
        return cur.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */