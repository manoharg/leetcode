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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // if(head.next==null)
        //     return null;
        ListNode dummy= new ListNode(-1);
        dummy.next=head;
        ListNode cur = head;
        for(int i=1;i<=n;i++){
            cur= cur.next;
        }
         // System.out.println("Current value" + cur.val);
    
        ListNode prev= dummy;
        while(cur!=null)
        {
            cur= cur.next;
            prev=prev.next;
        }
        
        prev.next=prev.next.next;
        return dummy.next;
    
    }
}