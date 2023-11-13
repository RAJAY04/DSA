package Kunals_Question_Video;

/**
 * Definition for singly-linked list.
 * public class Kunals_Question_Video.ListNode {
 *     int val;
 *     Kunals_Question_Video.ListNode next;
 *     Kunals_Question_Video.ListNode() {}
 *     Kunals_Question_Video.ListNode(int val) { this.val = val; }
 *     Kunals_Question_Video.ListNode(int val, Kunals_Question_Video.ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head , slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}