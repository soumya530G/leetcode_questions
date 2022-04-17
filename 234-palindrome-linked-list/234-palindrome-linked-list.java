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
    public boolean isPalindrome(ListNode head) {
        //find mid of linked list
        ListNode temp = head;
        ListNode head2 = rev_list(find_mid(temp));
        while(head2 != null){
            if(head2.val != temp.val){
                return false;
            }
            head2 = head2.next;
            temp = temp.next;
        }
        return true;    
    }
}