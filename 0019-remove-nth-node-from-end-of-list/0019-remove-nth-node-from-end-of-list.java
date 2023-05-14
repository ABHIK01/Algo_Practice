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
    public ListNode removeNthFromEnd(ListNode head, int n) {
          ListNode dummy = new ListNode(-1);
        dummy.next = head;
        //find the length
        ListNode current = head;
        int length = 0;
        while(current != null) {
            length++;
            current = current.next;
            
        }
      
        
        
         length = length - n;
        current = dummy;
        
        while(length > 0) {
            current = current.next;
            length--;
            
        }
        current.next = current.next.next;
        return dummy.next;
        
        
        
    }
}