 
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        ListNode first = new ListNode(7);
		ListNode second = new ListNode(7);
		ListNode third = new ListNode(7);
		ListNode fourth = new ListNode(7);
// 		ListNode fifth = new ListNode(5);
// 	    ListNode sixth = new ListNode(6);
// 		ListNode seven = new ListNode(7);
		

		
		first.next = second;
		second.next = third;
		third.next = fourth;
// 		fourth.next = fifth;
// 		fifth.next = sixth;
//         sixth.next = seven;
        
		removeElements(first,7);
    }
    
public static ListNode removeElements(ListNode head, int val) {
        
        ListNode curr = head;
        ListNode prev = curr;
       
        if(head == null) {
            return head;
        }
        
        while(curr != null)
        {
            System.out.println("here 1");
            if(curr.val == val) {
                prev.next = null;
                prev.next = curr.next;
                curr = curr.next;
                System.out.println("here 2");
                
            } 
            else {
                prev = curr;
                curr = curr.next;
                System.out.println("h4");
            }
        }
        System.out.println("h5");
      
        if(curr == null) {
            curr.val = 20;
            System.out.println("h6");
        }
        System.out.println("h7");
        curr = head;
        System.out.println("loop");
        while(curr!= null) {
            System.out.println(curr.val+"->");
            curr = curr.next;
        }
        return head;
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








