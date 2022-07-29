https://leetcode.com/problems/middle-of-the-linked-list/submissions/


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
    public ListNode middleNode(ListNode head) {
        
        ListNode curr = head;
        
        int limit = 0;
        int count = 0;
        
        while(curr != null)
        {
            limit++;
            curr = curr.next;
        }
        
         curr = head;
         if(limit%2 == 0)
         {
             while(count < (limit/2))
             {
                 count++;
                 curr = curr.next;
            }
            System.out.println("here 2((("+curr.val);
         }
         else 
         {
             while(count < (limit/2))
             {
                 count++;
                 curr = curr.next;
            }
            System.out.println("here 4((("+curr.val);
         }
        
        
     return curr;
    }
}
