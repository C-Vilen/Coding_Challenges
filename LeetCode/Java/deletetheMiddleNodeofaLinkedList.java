/**
 * 2095. Delete the Middle Node of a Linked List
 * You are given the head of a linked list. Delete the middle node, and return
 * the head of the modified linked list.
 * The middle node of a linked list of size n is the ⌊n / 2⌋th node from the
 * start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than
 * or equal to x.
 * - For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2,
 * respectively.
 */
public class deletetheMiddleNodeofaLinkedList {

    // Runtime 3ms beats 99.80%, Memory 64.44 MB beats 33.21%
    public static ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if (fast.next == null)
            return null;

        while (fast.next.next != null && fast.next.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
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
        ListNode six = new ListNode(6, null);
        ListNode two = new ListNode(2, six);
        ListNode eight = new ListNode(8, two);
        ListNode seven = new ListNode(7, eight);
        ListNode four = new ListNode(4, seven);
        ListNode three = new ListNode(3, four);
        ListNode one = new ListNode(1, three);
        System.out.println("Before example 1: " + printHeadToEnd(one));
        deleteMiddle(one);
        System.out.println("After example 1: " + printHeadToEnd(one) + " = 1 -> 3 -> 4 -> 8 -> 2 -> 6");
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
