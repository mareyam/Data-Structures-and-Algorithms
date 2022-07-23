https://leetcode.com/problems/add-two-numbers/

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.



class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int x = 0;
        int y = 0;
        int z = 1;
        
        while(l1 != null)
        {
            x = x+ z*(l1.val);
            z = z*10;
            l1 = l1.next;
        }
        z=1;
        
        while(l2 != null)
        {
            y = y+z*(l2.val);
            z = z*10;
            l2 = l2.next;
        }
         
        int sum = x + y;
        while(sum > 0)
        {
            ListNode node = new ListNode(sum%10);
            sum = sum/10;
            node = node.next;
           
        }
        return node;
    }
}
