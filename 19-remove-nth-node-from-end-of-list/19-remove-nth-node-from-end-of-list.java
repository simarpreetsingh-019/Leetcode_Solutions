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
      public static ListNode removeNthFromEnd(ListNode head, int n) {
      
    if(head == null)
        return head;
    ListNode slow = head;
    ListNode fast = head;
    
    while(n > 0)
    {
        fast = fast.next;
        n--;
    }
    
    if(fast == null)
    {
        ListNode rnode = slow;
        head = rnode.next;
        rnode.next = null;
        return head;
    }
    
    while(fast.next != null)
    {
        slow = slow.next;
        fast = fast.next;
    }
    
    ListNode rnode = slow.next;
    slow.next = rnode.next;
    rnode.next = null;
    
    return head;
  }
}