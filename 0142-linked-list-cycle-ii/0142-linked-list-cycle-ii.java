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
        
    }
}