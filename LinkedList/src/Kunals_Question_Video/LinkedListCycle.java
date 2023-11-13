package Kunals_Question_Video;

/**
 * Definition for singly-linked list.
 * class Kunals_Question_Video.ListNode {
 *     int val;
 *     Kunals_Question_Video.ListNode next;
 *     Kunals_Question_Video.ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}