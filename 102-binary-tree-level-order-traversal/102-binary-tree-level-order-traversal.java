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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        
        if(root == null) {
            System.out.println("root is null, returning wrap list now");
            return wrapList;
        }
        System.out.println("adding root " + root.val + " to the queue");
        //we add to the queue using offer
        queue.offer(root);
        while(!queue.isEmpty()){
            System.out.println("since queue is not empty we store queue size i.e " + queue.size() + " in levelNum");
            int levelNum = queue.size();
            System.out.println("creating a new sublist");
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0; i<levelNum; i++) {
                if(queue.peek().left != null){
                    System.out.println("since " + queue.peek().left.val + " is not null, we add " + queue.peek().left.val + " to the queue now");
                     queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null) {
                     System.out.println("since " + queue.peek().right.val + " is not null, we add " + queue.peek().right.val + " to the queue now");
                    queue.offer(queue.peek().right);
                }
                System.out.println("adding " + queue.peek().val + " to the sublist");
                //poll() is like pop() for queue
                subList.add(queue.poll().val);
            }
            System.out.println("adding sublist to the wraplist now");
            wrapList.add(subList);
        }
        return wrapList;
        
    }
}