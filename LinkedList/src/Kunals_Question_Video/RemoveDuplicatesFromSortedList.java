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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        if(head == null){
            return head;
        }
        while(node.next != null){
            if(node.val != node.next.val){
                node = node.next;
            }else{
                node.next = node.next.next;
            }
        }
        return head;
    }
}