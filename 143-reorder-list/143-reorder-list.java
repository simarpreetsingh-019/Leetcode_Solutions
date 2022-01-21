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
    public ListNode midNode(ListNode head)
    {
        if (head == null || head.next == null)
            return head;
        
        ListNode fast = head, slow = head;
        while(fast.next != null && fast.next.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    
    public ListNode reverse(ListNode head)
    {
        if (head == null || head.next == null)
            return head;
        
        ListNode curr = head,
                 prev = null,
                 next = null;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public void reorderList(ListNode head)
    {
        ListNode mid = midNode(head);
        ListNode next_to_mid = mid.next;
        mid.next = null;
        ListNode p2 = reverse(next_to_mid);
        
        ListNode p1 = head,
                 p1Next,p2Next;
        
        while(p2 != null)
        {
            p1Next = p1.next;
            p2Next = p2.next;
            
            p1.next = p2;
            p2.next = p1Next;
            
            p1 = p1Next;
            p2 = p2Next;
        }
            
        
    }
}