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
   int maxDepth(TreeNode node)
    {
        if (node == null)
            return -1;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);
  
            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
             else
                return (rDepth + 1);
        }
    }
    public int findBottomLeftValue(TreeNode root) {
      ArrayList<Integer> list = new ArrayList<>();
     int currlevel = 0;
     TreeNode root2 = root;
     int h = maxDepth(root2) + 1;
    // System.out.println("height is" + h);
     int t = 0;
     Queue<TreeNode> queue = new LinkedList<>();    
      queue.add(root);
      while(queue.size() > 0){
         int temp = queue.size();
         currlevel++;
         for(int i = 0; i < temp; i++){
             TreeNode tmp = queue.remove();
             //for every level there is add to our list
             if(i == 0 && currlevel == h){
                 t = tmp.val;
             }
             if(tmp.left!=null){
                queue.add(tmp.left); 
             }
             if(tmp.right!=null){
                queue.add(tmp.right); 
             }
         }
      }
      return t;
    }
}