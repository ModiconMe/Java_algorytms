package list.linked_list;

/* https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1.
        The linked list holds the binary representation of a number.

        Return the decimal value of the number in the linked list.

        The most significant bit is at the head of the linked list.*/
public class LeetCode1 {
    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public int getDecimalValue(ListNode head) {
        int result = 0;
        int rate = getRate(head);
        while (head != null) {
            if (head.val == 1) {
                result += (int)Math.pow(2, rate);
            }
            head = head.next;
            rate--;
        }

        return result;
    }
    public int getRate(ListNode head) {
        int rate = 0;
        while (head.next != null) {
            rate++;
            head = head.next;
        }
        return rate;
    }
    }
