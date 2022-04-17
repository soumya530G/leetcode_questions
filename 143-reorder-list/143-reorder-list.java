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
    public ListNode rev_list(ListNode head){
         ListNode prev = null, curr = head, temp = head;
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public ListNode find_mid(ListNode head){
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
     
        return slow;
    }
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
         ListNode mid = find_mid(head);
         ListNode head2 = mid.next;
         mid.next = null;
         head2 = rev_list(head2);
        //re order 
        ListNode c1 = head;
        ListNode c2 = head2;
        ListNode f1 = head;
        ListNode f2 = head2;
        while(c2 != null){
           f1 = c1.next;
           f2 = c2.next;
           c1.next = c2;
           c2.next = f1;
           c2 = f2;
           c1 = f1;
        } 
    }
}