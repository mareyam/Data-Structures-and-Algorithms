You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.

https://leetcode.com/problems/merge-two-sorted-lists/


public static ListNode mergeTwoLists(ListNode list1, ListNode list2) 
{
       ListNode dummy = new ListNode(0);
       ListNode list3 =dummy;
       
       while(list1 != null && list2 != null)
       {
           if(list1.val <= list2.val )
           {
              
               list3 = list1;
               list1 = list1.next;
               System.out.println("while 1st if"+list3.val+"-->");
               list3 = list3.next;
           }
           else if(list2.val <= list1.val)
           {
               list3 = list2;
                list2 = list2.next;
                 System.out.println("while 2st if"+list3.val+"-->");
               list3 = list3.next;
           }
       }
       
        while(list1 != null)
        {
             list3 = list1;
                list1 = list1.next;
                System.out.println("2 while"+list3.val+"-->");
               list3 = list3.next;
        }
        while(list2 != null)
        {
             list3 = list1;
                list2 = list2.next;
               System.out.println("3 while"+list3.val+"-->");
               list3 = list3.next;
        }
        
        return list1;
    }
    
}
