/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static class pair implements Comparable<pair>{
        TreeNode node;
        int w; //vert
        int d; //hor
        
        pair(TreeNode node, int w, int d){
            this.node = node;
            this.w = w;
            this.d = d;
        }
        // this - other means increasing (i.e, we want the smallest value)
        // other - this means decreasing (i.e, we want the largest value among them)
        //this function is used for cases where we have to decide which node at the same row comes first like in example 2nd with 5 and 6 node
        public int compareTo(pair other){
            if(this.d == other.d){
                return this.node.val - other.node.val;
            }
            else{
                return this.d - other.d;
            }
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<pair> queue = new LinkedList<>();
        queue.add(new pair(root, 0, 1));
        int lmw = 0, rmw = 0;
        //we're using priority queue just because we want our stuff to be sorted, if we had used arraylist instead we would have to sort it
        HashMap<Integer, PriorityQueue<pair>> map = new HashMap<>();
        while(queue.size() > 0){
            pair temp = queue.remove();
            //we do this comparison so that we get in the end the left most vertical line and the right most vertical line, this is helpful when we have to traverse the whole thing in order to convert priority queue to array list
            if(temp.w < lmw){
                lmw = temp.w;
            }
            if(temp.w > rmw){
                rmw = temp.w;
            }
            //check if our map already has that vertical index in it's records
            if(map.containsKey(temp.w) == false){
                //if it does not create a new priority queue at that index
                map.put(temp.w, new PriorityQueue<>());
                //get that said index and at that index add our new temp value to it
                map.get(temp.w).add(temp);
            }
            else{
               //just add to the existing priority queue at that horizontal index
               //now when we say we're adding temp we mean the whole pair since temp is of type pair 
               map.get(temp.w).add(temp); 
            }
            //we're adding the curr node's childern to the queue here 
            if(temp.node.left != null){
                queue.add(new pair(temp.node.left, temp.w - 1, temp.d + 1));
            }
            if(temp.node.right != null){
                queue.add(new pair(temp.node.right, temp.w + 1, temp.d + 1));
            }
        }
        //here we're basically just converting our priority queue to array list
        List<List<Integer>> res = new ArrayList<>();
        int idx = 0;
        for(int h = lmw; h <= rmw; h++){
            ArrayList<Integer> list = new ArrayList<>();
            PriorityQueue<pair> pq = map.get(h);
            while(pq.size() > 0){
                pair temp = pq.remove();
                list.add(temp.node.val);
            }
            res.add(list);
            idx++;
        }
        return res;
    }
}