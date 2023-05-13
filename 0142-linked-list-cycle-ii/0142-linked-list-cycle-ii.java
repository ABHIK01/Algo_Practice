/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        /*
        Set<ListNode> seenNodes = new HashSet<>();
        
        
        ListNode node = head;
        while(node != null) {
            if(seenNodes.contains(node)) {
                return node;
            }
            seenNodes.add(node);
            node = node.next;
        }
        return null;
        */
        //slow 3 2 0 -4 fast 3 0 2 -4
            //
            //now reset 
            //slow 3 2 fast -4 2
        ListNode slow = head,fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                slow = head;
            
            
            while(slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
                return slow;
            }
        }
        
        return null;
        
    }
}