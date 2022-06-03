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
    public ListNode mergeKLists(ListNode[] lists) {
        //default behavior = min PQ
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a , b)->{
          return a.val - b.val;  // this - other for default behavior 
            //b.val - a.val for other - this, for rev of default behavior 
        });
        for(ListNode l: lists){
            if(l != null){
                pq.add(l);
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while(pq.size() != 0){
            ListNode node = pq.remove();
            prev.next = node;
            prev = prev.next;
            node = node.next;
            if(node != null) pq.add(node);
        }
        return dummy.next;
    }
}