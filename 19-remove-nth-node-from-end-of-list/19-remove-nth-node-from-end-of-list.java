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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        ListNode s = dummy;
       for(int i=1; i<=n+1; i++)   {
        temp = temp.next;
    }
        while(temp != null){
            s = s.next;
            temp = temp.next;
        }
        s.next = s.next.next;
        return dummy.next;
    }
}