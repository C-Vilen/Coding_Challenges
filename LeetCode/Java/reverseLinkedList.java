// 206. Reverse Linked List
// Given the head of a singly linked list, reverse the list, and return the reversed list.
public class reverseLinkedList {
    
    // Runtime 0 ms beats 100%, Memory 42.42 MB beats 36.11%
    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null ) return head;
        ListNode old = null;  
        ListNode newHead = head;
    
        while(newHead != null) { 
            ListNode next = newHead.next; 
            newHead.next = old;
            old = newHead;
            newHead = next;
        }
       return old; 
    }

    public static String printHeadToEnd(ListNode head){
        String output = "";
        while(head != null){
            output += head.val + " -> ";
            head = head.next;
        }
        return output;
    }

    public static void main(String[] args) {
        ListNode five = new ListNode(5);
        ListNode four = new ListNode(4, five);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        ListNode one = new ListNode(1, two);
        System.out.println("Before example 1: " + printHeadToEnd(one));
        reverseList(one);
        System.out.println("After example 1: " + printHeadToEnd(one));
    }
}
class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
