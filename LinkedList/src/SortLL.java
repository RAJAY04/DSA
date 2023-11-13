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
    // Main function to sort a linked list
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }

    // Function to perform merge sort on the linked list
    ListNode mergeSort(ListNode head){
        // Base case: if the list is empty or has only one node
        if(head == null || head.next == null){
            return head;
        }
        // Get the middle node of the list
        ListNode mid = getMidNode(head);
        // Split the list into two halves
        ListNode next_head = mid.next;
        mid.next = null;
        // Recursively sort the two halves
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(next_head);
        // Merge the sorted halves
        return merge(left,right);
    }

    // Function to get the middle node of a linked list
    ListNode getMidNode(ListNode head){
        // Base case: if the list is empty or has only one node
        if(head == null || head.next == null){
            return head;
        }
        // Initialize two pointers, one moves twice as fast as the other
        ListNode fast = head , slow = head;
        // Move the fast pointer two steps and the slow pointer one step at a time
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        // When the fast pointer reaches the end, the slow pointer will be at the middle
        return slow;
    }

    // Function to merge two sorted linked lists
    ListNode merge(ListNode left, ListNode right){
        // If either list is empty, return the other list
        if(left == null ){
            return right;
        }
        if(right == null){
            return left;
        }
        // Initialize pointers for the two lists and a dummy node for the merged list
        ListNode l1 = left , l2 = right;
        ListNode merged = new ListNode(0);
        ListNode cur = merged;
        // Merge the nodes in sorted order
        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                cur.next = l2;
                l2 = l2.next;
            }else{
                cur.next = l1;
                l1 = l1.next;
            }
            cur = cur.next;
        }
        // If there are remaining nodes in either list, append them to the merged list
        if(l1 == null){
            cur.next = l2;
        }else{
            cur.next = l1;
        }
        // Return the merged list, skipping the dummy node
        return merged.next;
    }
}
