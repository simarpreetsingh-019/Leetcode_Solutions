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
    public int pairSum(ListNode head) {
        int sum = 0;
        ListNode slow = head;
        ListNode fast = head;
        
		//finding middle node of list
        while(fast.next!=null && fast.next.next!=null) {
            
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode current = slow.next;
        slow.next = null;
        ListNode previous = null;
        ListNode nextNode = null;
        
		
        //reversing the second half
        while(current!=null) {
        
            nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        
        //calculating max sum
         while(head!=null && previous!=null) {
             
             sum = Math.max(sum, head.val + previous.val);
             head = head.next;
             previous = previous.next;
         }
        
        return sum;
        
    }
}