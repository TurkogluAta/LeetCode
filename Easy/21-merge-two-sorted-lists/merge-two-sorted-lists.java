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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        // Initialize a dummy node to simplify edge cases
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        // Merge nodes from both lists in sorted order
        while (list1 != null && list2 != null) {
            
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            
            current = current.next;
        }

        // Attach any remaining nodes from list1 or list2
        current.next = (list1 != null) ? list1 : list2;

        // Return the head of the merged list
        return dummy.next;
    }
}