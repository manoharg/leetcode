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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
     
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        
        ListNode dummy = new ListNode(-1);
        dummy.next =null;
        ListNode head = dummy;
        ListNode l1t = l1;
        ListNode l2t = l2;
        while(l1t !=null && l2t!=null) {
            if(l1t.val<=l2t.val){
                
                dummy.next = l1t;
                l1t = l1t.next;
                
            }else {
               
                dummy.next = l2t;
                l2t = l2t.next;
            }
            dummy = dummy.next;
        }
        while(l1t!=null){
            
             dummy.next = l1t;
                l1t = l1t.next;
            dummy = dummy.next;
            
        }
        while(l2t!=null){
           
             dummy.next = l2t;
                l2t = l2t.next;
            dummy = dummy.next;
            
        }
        return head.next;
        
        }
}