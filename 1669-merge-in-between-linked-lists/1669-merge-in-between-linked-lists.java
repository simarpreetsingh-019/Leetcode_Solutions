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
        ListNode S = list1; // take any value because it will be changed in if condition
        for(; cnt<=b && list1.next != null; cnt++){
            if(cnt == a) S = list1;
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
