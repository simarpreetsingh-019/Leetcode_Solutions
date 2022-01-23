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
    public ListNode removeElements(ListNode head, int val) {
       //  if(head == null || head.next == null)
       //      return head;
       //  ListNode temp = head;
       //  if(temp.val == val)
       //  {
       //      temp = temp.next;
       //      head = temp;
       //  }
       // ListNode temp=head;
        ListNode temp  = head;
    while(temp!=null)
    {
        if(temp.val==val)           // moving head and temp if first node contains value we want to delete
        {
            temp=temp.next;
            head=temp;
        }
        else if(temp.next!=null && temp.next.val==val)     
        {
            temp.next=temp.next.next;
        }
        else
        {
            temp=temp.next;
        }
    }
    return head;
}
}