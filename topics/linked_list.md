 ### [Merge two sorted linked lists](https://leetcode.com/problems/merge-two-sorted-lists/)

#### Approach
1. Maintain a dummy pointer to the head.
2. Take two pointers to both the lists
3. Append the node whichever is smaller


Time complexity : O(n+m)

Space complexity : O(1)

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                p.next = l2;
                break;
            }
            if (l2 == null) {
                p.next = l1;
                break;
            }
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        return dummy.next;
    }
}
```

Palindrome linked list

Odd even linked list

Reverse linked list  between m and n

Reverse linked list in groups of k


