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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode dummy = new ListNode(-1);
        ListNode p= dummy;
        int carry=0;
        while(l1!=null||l2!=null){
            int first = l1==null?0:l1.val;
            int second = l2==null?0:l2.val;
            int total = first+second+carry;
            carry= total/10;
            total = total%10;
            ListNode newNode = new ListNode(total);
            p.next=newNode;
            l1= l1==null?null:l1.next;
            l2= l2==null?null:l2.next;
            p=p.next;
        
        }
        
        if(carry>0)
            p.next= new ListNode(carry);
        
        return dummy.next;
        
    }
}