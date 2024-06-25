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
        if(head == null || head.next == null) return head;
    
        ListNode base = new ListNode(head.val);
        ListNode prev = base, current = head;
        while(current != null) {
            if(prev.val != current.val) {
                prev.next = new ListNode(current.val);
                prev = prev.next;
            }
            current = current.next;

        }
        return base;


    
        
    }
}