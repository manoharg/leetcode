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

    //    D 1 2 3 4 4 5
    //          p   c

    //        p.next = c.next
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-10000);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = head;
        while (cur != null) {
            boolean dup = false;
            while (cur.next != null && cur.val == cur.next.val) {
                dup = true;
                cur = cur.next;
            }

            if (!dup) {
                prev.next = cur;
                prev = cur;
            } else {
                prev.next = cur.next;
                // prev=cur.next;
            }

            // System.out.println(prev.val);
            cur = cur.next;
        }

        return dummy.next;
    }
}
