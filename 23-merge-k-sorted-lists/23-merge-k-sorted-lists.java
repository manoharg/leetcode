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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(( a, b)->( a.val-b.val));
        
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null)
            pq.offer(lists[i]);
        }
        
        ListNode dummy = new ListNode(0);
         dummy.next =null;
        ListNode head = dummy;
       
        while(!pq.isEmpty()){
            ListNode temp = pq.poll();
            dummy.next = temp;
            if(temp!=null && temp.next !=null){
                pq.offer(temp.next);
               // temp = temp.next;
            }
            dummy= dummy.next;
            
        }
        return head.next;
    }
}