package Kunals_Question_Video;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class Reverse_LL {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null, present = head, ahed = head.next;
        while (present != null) {
            present.next = prev;
            prev = present;
            present = ahed;
            if (ahed != null) {
                ahed = ahed.next;
            }
        }
        head = prev;
        return head;
    }
}

