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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode l = head;
        while(l != null)
        {
            if(l.next == null)
            {
                break;
            }
            if(l.val == l.next.val)
            {
                l.next = l.next.next;
            }
            else
            {
                l = l.next;
            }
        }
        return head;
    }
}