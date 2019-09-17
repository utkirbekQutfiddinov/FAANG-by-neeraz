import java.util.Deque;
import java.util.LinkedList;

public class PrintLinkedListInReverse {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next = new ListNode(5);
        printLinkedListReverse(head);
    }

    private static void printLinkedListReverse(ListNode head) {
        Deque<Integer> stack = new LinkedList<>();
        while (head.next != null) {
            stack.add(head.val);
            head = head.next;
        }

        while (stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

    }
}