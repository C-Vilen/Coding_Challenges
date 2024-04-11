/**
 * 328. Odd Even Linked List
 * Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
 * The first node is considered odd, and the second node is even, and so on.
 * Note that the relative order inside both the even and odd groups should remain as it was in the input.
 * You must solve the problem in O(1) extra space complexity and O(n) time complexity.
 */
public class oddEvenLinkedList {

    public static ListNode oddEvenList(ListNode head) {
        // Runtime 0ms beats 100%, Memory 44.70 MB beats 14.78%
        if(head == null || head.next == null || head.next.next == null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
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
        ListNode five = new ListNode(5);
        ListNode four = new ListNode(4, five);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        ListNode one = new ListNode(1, two);
        System.out.println("Before example 1: " + printHeadToEnd(one));
        oddEvenList(one);
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

