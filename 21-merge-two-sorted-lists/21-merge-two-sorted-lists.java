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
        ListNode head = new ListNode(0);
        ListNode curr = head;
        ListNode s1 = list1, s2 = list2;
        while(s1 != null && s2 != null){
            if(s1.val <= s2.val){
                curr.next = s1;
                s1 = s1.next;
            }
            else{
                curr.next = s2;
                s2 = s2.next;  
            }
            curr = curr.next;
        }
        if(s1 != null){
            curr.next = s1;
        }
        if(s2 != null){
            curr.next = s2;
        }
        return head.next;
    }
}