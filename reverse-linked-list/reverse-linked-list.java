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
    public ListNode reverseList(ListNode head) {
        ListNode current = head;//1->2->3->4->5
        ListNode previous = null;
        ListNode next = null;
        //current = 1
        //next = 2
        //1->null
        //prev = 1
        //current = 2
        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            
            
            
        }
        return previous;
        
    }
}