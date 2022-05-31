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
    int sum = 0;
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.right == null && root.left == null){
            return 1;
        }
        int lr = maxDepth(root.left);
        int rr = maxDepth(root.right);
        System.out.println(lr + " , " + rr);
        sum = Math.max(lr, rr) + 1;
        System.out.println(sum);
        return sum;
    }
}