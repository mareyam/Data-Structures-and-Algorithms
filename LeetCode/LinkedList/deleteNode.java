class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(6);
		ListNode fourth = new ListNode(3);
		ListNode fifth = new ListNode(4);
		ListNode sixth = new ListNode(5);
		ListNode seven = new ListNode(6);
		

		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
        sixth.next = seven;
        
		removeElements(first,6);
}
    public static ListNode removeElements(ListNode head, int val) {
        if(head.val == val) {
             System.out.println("head is not null ");
            while(head.val == val && head.next != null) {
                head = head.next;
                System.out.println("head.va");
            }
            System.out.println("head is null 1");
        }
        if(head == null || head.next == null) {
            System.out.println("head is null 2");
            return null;
        }
        System.out.println("before asign");
        ListNode curr = head;
        ListNode prev = curr;
        
        while(curr != null)
        {
            System.out.println("here 1");
            if(curr.next == null && curr.val == val)
            {
                System.out.println("curr next val");
                curr = null;
            }
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









// class HelloWorld {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//         ListNode first = new ListNode(1);
// 		ListNode second = new ListNode(2);
// 		ListNode third = new ListNode(3);
// 		ListNode fourth = new ListNode(4);

		
// 		first.next = second;
// 		second.next = third;
// 		third.next = fourth;

// 		removeElements(first,4);
//     }
    
// public static ListNode removeElements(ListNode head, int val) {
        
//         ListNode curr = head;
//         ListNode prev = curr;
       
//         if(head == null) {
//             return head;
//         }
//         if(head.val == val) {
//             System.out.println("here head val");
//             head = head.next;
//         }
        
//         while(curr != null || curr.next == null)
//         {
//             System.out.println("here 1");
//             if(curr.next == null && curr.val == val)
//             {
//                 System.out.println("curr next val");
//             }
//             if(curr.val == val) {
//                 prev.next = null;
//                 prev.next = curr.next;
//                 curr = curr.next;
//                 System.out.println("here 2");
                
//             } 
//             else {
//                 prev = curr;
//                 curr = curr.next;
//                 System.out.println("h4");
//             }
//         }
//         System.out.println("h5");
      
        
//         curr = head;
//         System.out.println("loop");
//         while(curr!= null) {
//             System.out.println(curr.val+"->");
//             curr = curr.next;
//         }
//         return head;
//     }
  
 
               
// }

//     class ListNode {
// 		public int val; 
// 		public ListNode next; 

// 		public ListNode(int val) {
// 			this.val = val;
// 			this.next = null;
// 		}
// 	}
  if(head.val == val) {
             System.out.println("head is not null ");
            while(head.val == val && head.next != null) {
                head = head.next;
                System.out.println("head.va");
            }
            System.out.println("head is null 1");
        }
        if(head == null || head.next == null) {
            System.out.println("head is null 2");
            return null;
        }
        System.out.println("before asign");
        ListNode curr = head;
        ListNode prev = curr;
        
        while(curr != null)
        {
            System.out.println("here 1");
            if(curr.next == null && curr.val == val)
            {
                System.out.println("curr next val");
                curr = null;
            }
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
      
        
        curr = head;
        System.out.println("loop");
        while(curr!= null) {
            System.out.println(curr.val+"->");
            curr = curr.next;
        }
        return head;
    }
  
 
               
}
