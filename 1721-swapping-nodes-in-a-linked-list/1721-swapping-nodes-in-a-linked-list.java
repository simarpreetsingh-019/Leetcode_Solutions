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
    public ListNode swapNodes(ListNode head, int k) {		
        ListNode f = head, s = head;
        for(int i=1; i<k ; i++) f = f.next;
            
        ListNode  t = f;
        while(f.next != null) {
			s = s.next;
            f = f.next;
        }
        
        int temp = t.val;
        t.val = s.val;
        s.val = temp;
        return head;
    }
}