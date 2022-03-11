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
         public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null)
            return head;
     int len =0;
        ListNode cur=head;
    
        while(cur!=null) {
            len++;
            cur= cur.next;
        }
      k=k%len;
        if(k==0)
            return head;
       ListNode fast =head;
        ListNode slow = head;
        ListNode temp = head;
        for(int i=0;i<k;i++ ) {
            fast=fast.next;
        }
        while(fast.next!=null) {
            fast= fast.next;
            slow  = slow.next;
        }
        ListNode newHead = slow.next;
        fast.next= head;
        slow.next= null;
        return newHead;
    }
}