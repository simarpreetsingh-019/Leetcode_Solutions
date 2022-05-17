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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode L1 = list1;
        int cnt=1;
        for(; cnt<a && list1.next != null; cnt++){
            list1 = list1.next;
        }
        ListNode S = list1;
        for(; cnt<=b && list1.next != null; cnt++){
            list1 = list1.next;
        }
        S.next = list2;
        while(list2.next != null){
            list2 = list2.next;
        }
        list2.next = list1.next;
        return L1;
    }
}
