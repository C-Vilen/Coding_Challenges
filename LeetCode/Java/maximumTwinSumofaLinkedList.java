/**
 * 2130. Maximum Twin Sum of a Linked List
 * In a linked list of size n, where n is even, the ith node (0-indexed) of the linked list is known as the twin of the (n-1-i)th node, if 0 <= i <= (n / 2) - 1.
 *  - For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2. These are the only nodes with twins for n = 4.
 * The twin sum is defined as the sum of a node and its twin.
 * Given the head of a linked list with even length, return the maximum twin sum of the linked list.
 */
public class maximumTwinSumofaLinkedList {
    
    // Runtime 4 ms beats 97.66%, Memory 63.39 MB beats 71.17%
    public static int pairSum(ListNode head) {
        if (head.next.next == null) return (head.val + head.next.val);
        int max = 0;
        ListNode slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        while(slow != null){
            fast = slow.next;
            slow.next = prev;
            prev = slow;
            slow = fast;
        }

        while (prev != null) {
            max = Math.max(max, (head.val + prev.val));
            head = head.next;
            prev = prev.next;
        }
        return max;
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
        ListNode four = new ListNode(1);
        ListNode three = new ListNode(2, four);
        ListNode two = new ListNode(4, three);
        ListNode one = new ListNode(5, two);
        System.out.println("Before example 1: " + printHeadToEnd(one));
        System.out.println(pairSum(one));
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
