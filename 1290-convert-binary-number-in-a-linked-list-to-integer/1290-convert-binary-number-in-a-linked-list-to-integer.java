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
    public int getDecimalValue(ListNode head) {
        if(head==null)return -1;
        ListNode newNode=head;
        int count=0;
        int ans=0;
        while(newNode.next!=null){
            newNode=newNode.next;
            count++;
        }
        for(int i=count;i>=0;i--){
            ans+=head.val*(Math.pow(2,i));
            head=head.next;
        }
        return ans;
    }
}