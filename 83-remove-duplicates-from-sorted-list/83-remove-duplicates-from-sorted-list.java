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
        ListNode tempHead = head;
         
        while(tempHead != null) {
            if (tempHead.next == null) 
                return head;
            if (tempHead.val == tempHead.next.val) 
                tempHead.next = tempHead.next.next;
            else 
                tempHead = tempHead.next;
        }
        return head;
    }
}
