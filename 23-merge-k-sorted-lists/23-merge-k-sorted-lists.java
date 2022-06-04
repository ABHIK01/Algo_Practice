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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 1) {
            return lists[0];
        }
        
        if(lists.length == 0) {
            return null;
        }
        
        ListNode head = mergeTwoList(lists[0],lists[1]);
        for(int i = 2;i<lists.length;i++) {
            head = mergeTwoList(head,lists[i]);
        }
        
        return head;
        
    }
    
    ListNode mergeTwoList(ListNode list1,ListNode list2) {
        ListNode node = new ListNode();
        ListNode head = node;
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }
        
        if(list1 != null) {
            node.next = list1;
        }
        
        if(list2 != null) {
            node.next = list2;
        }
        
        return head.next;
    }
}