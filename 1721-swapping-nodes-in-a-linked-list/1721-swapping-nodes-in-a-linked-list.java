/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode swapNodes(ListNode head, int k) {
        if(head.next==null)
            return head;
        ListNode fast = head;
        ListNode slow = head;
        ListNode n1 = fast;
        for (int i = 0; i < k - 1; i++) {
            fast = fast.next;
            n1 = fast;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        int temp = slow.val;
        slow.val = n1.val;
        n1.val = temp;
        return head;
    }
}
