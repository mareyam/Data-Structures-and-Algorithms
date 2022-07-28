https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/solution/


class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(2);
		ListNode fourth = new ListNode(3);
		ListNode fifth = new ListNode(3);
		ListNode s = new ListNode(4);
		ListNode ss = new ListNode(5);
		
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
        fifth.next = s;
        s.next = ss;
        
        ListNode curr = first;
        ListNode prev = curr;
        ListNode temp = curr;
        
        while(curr!= null && curr.next != null) {
            if(curr.val == curr.next.val) {
                temp.val = curr.val;
                while(curr.val == temp.val)
                {
                    curr = curr.next;
                    System.out.println(curr.val+"->"+curr.next.val+"->"+temp.val);
                }
               // prev.next = curr;
                 curr.next = curr.next.next;
            }
            else 
            {
                prev = curr;
                curr = curr.next;
                System.out.println("else"+curr.val+"->"+curr.next.val+"->"+prev.val);
            }
        }
        System.out.println("loop");
        curr = first;
        while(curr != null)
        {
            System.out.println(curr.val+"->");  
            curr = curr.next;
        }
        
    }
}

    class ListNode {
		public int val; 
		public ListNode next; 

		public ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}
