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
    public boolean isPalindrome(ListNode head) {
        ListNode second= middle(head);
        second=reverse(second);
        ListNode p = head;
        while(second!=null){
            if(p.val!=second.val)
                return false;
            p=p.next;
            second=second.next;
            
        }
        
        return true;
    }
    private ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode cur = head;
        while(cur!=null){
            ListNode temp = cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
}