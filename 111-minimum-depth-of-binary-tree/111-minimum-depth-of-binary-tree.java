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
      int leftdpath, rightdpath;
    public int minDepth(TreeNode root) {
        //if root is the only node
          if(root == null){
            return 0;
        }
        // for leaf nodes
        if(root.right == null && root.left == null){
            return 1;
        }
        int leftdpath = root.left != null ? minDepth(root.left) : Integer.MAX_VALUE;
        int rightdpath = root.right != null ? minDepth(root.right) : Integer.MAX_VALUE;
        return Math.min(leftdpath, rightdpath) + 1;
    }
}