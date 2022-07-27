
//incomplete
Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.

 
 
 
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		ListNode sixth = new ListNode(6);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		
		reverse(first);
    }
    public static void reverse(ListNode head) {
        int count = 0;
        int k = 2;
        int length = 5;
        
        ListNode curr = head;
        while(length >= k && curr != null) {
            count = 0;
            while(count < 2 && curr!= null) {
                System.out.println(count+"->"+length+"->"+curr.data);
                curr = curr.next;
                count++;
            }
            length = length - k;
        }
    }
    
}


class ListNode {
		public int data; 
		public ListNode next; 

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
