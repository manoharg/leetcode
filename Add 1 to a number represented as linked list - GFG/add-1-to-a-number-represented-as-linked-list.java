//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node addOne(Node head) 
    { 
        if(head==null)
        return new Node(1);
        //code here.
        head = reverse(head);
        int carry = 1;
        Node p=head, temp=null;
        
        while(p!=null){
            int sum = p.data+carry;
            p.data = (sum)%10;
            carry= (sum)/10;
            temp=p;
            p=p.next;
        }
        if(carry>0){
            temp.next= new Node(carry);
        }
        
        return reverse(head);
    }
    
    private static Node reverse(Node head){
        Node cur = head;
        Node prev= null;
        while(cur!=null){
            Node next = cur.next;
            cur.next = prev;
            prev =cur;
            cur = next;
            
        }
        return prev;
        
    }
}
// 754
// 86
