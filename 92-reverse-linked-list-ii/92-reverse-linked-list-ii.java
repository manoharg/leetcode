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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next= head;
        ListNode prev = dummy;
        ListNode cur = dummy.next;
        int i=1;
        while(i<left){
            prev= prev.next;
            cur = cur.next;
            i++;
        }
        ListNode node = prev;
        while(i<=right){
            ListNode next = cur.next;
            cur.next = prev;
            prev=cur;
            cur=next;
            i++;
        }
        
        node.next.next = cur;
        node.next=prev;
        
        return dummy.next;
    }
}