/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        while(head!=null)
        {
            ListNode next= head.next;
            head.next= prev;
            prev=head;
            head=next;
        }
        return prev;
    }
    public void print(ListNode l1)
    {
        ListNode temp=l1;
        while(temp!=null)
        {
            System.out.print(temp.val+"-->");
            temp= temp.next;
        }
        System.out.println();
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
   //     l1= reverse(l1);
     //   l2=reverse(l2);
       // print(l1);
       // print(l2);
        ListNode temp= add(l1,l2);
        //print(temp);
    return temp;    
    }
    public ListNode add(ListNode l1, ListNode l2)
    {
        if(l1==null&&l2==null)
            return null;
        ListNode head= new ListNode(0);
        ListNode pointer=head;
        int carry=0;
        while(l1!=null&&l2!=null)
        {
            int sum=l1.val+l2.val+carry;
            carry=sum/10;
            pointer.next=new ListNode(sum%10);
            pointer=pointer.next;
            l1=l1.next;
            l2=l2.next;
            
        }
        while(l1!=null)
        {
            int sum=l1.val+carry;
            carry=sum/10;
            pointer.next=new ListNode(sum%10);
            pointer=pointer.next;
            l1=l1.next;
        }
         while(l2!=null)
        {
            int sum=l2.val+carry;
            carry=sum/10;
            pointer.next=new ListNode(sum%10);
            pointer=pointer.next;
            l2=l2.next;
        }
        if(carry!=0)
            pointer.next= new ListNode(carry);
        return head.next;
    }
    
}