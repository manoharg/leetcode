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

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;
        int i = 0;

        // Dont reverse the last part
        ListNode check = head;
        int count = 0;
        while (check != null && count < k) {
            check = check.next;
            count++;
        }
        if (count != k) return head;
        //

        while (cur != null && i < k) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            i++;
        }

        head.next = reverseKGroup(cur, k);

        return prev;
    }
}
