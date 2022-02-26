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
    
    public ListNode mergeTwoLists(ListNode s, ListNode f) {
        ListNode head = new ListNode(0);
        ListNode ret = head;
        while(s != null && f != null)
        {
            if(s.val <= f.val)
            {
                ret.next = s;
                s = s.next;
            }
            else
            {
                ret.next = f;
                f = f.next;
            }
            ret = ret.next;
        }
        if(s != null)
        {
            ret.next = s;
                
        }
        if(f != null)
        {
            ret.next = f;
                
        }
        return head.next;
    }
}