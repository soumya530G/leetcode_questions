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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
      if(root == null){
            return list;
        }
     Queue<TreeNode> queue = new LinkedList<>();    
      queue.add(root);
      while(queue.size() > 0){
         int temp = queue.size();
         for(int i = 0; i < temp; i++){
             TreeNode tmp = queue.remove();
             //for every level there is add to our list
             if(i == 0){
                list.add(tmp.val); 
             }
             if(tmp.right!=null){
                queue.add(tmp.right); 
             }
             if(tmp.left!=null){
                queue.add(tmp.left); 
             }
         }
      }
      return list;
    }
}