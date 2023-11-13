/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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