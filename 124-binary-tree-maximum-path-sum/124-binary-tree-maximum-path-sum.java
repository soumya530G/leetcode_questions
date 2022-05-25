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
     int max1 = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        max1 = Integer.MIN_VALUE;
        maxpathsum(root);
        return max1;
    }
    public int maxpathsum(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = maxpathsum(node.left);
        int right = maxpathsum(node.right);
        int left_d = Math.max(0, left);
        int right_d = Math.max(0, right);
        int sum = left_d + node.val + right_d;
        if(sum > max1){
            max1 = sum;
        }
        //max1 = Math.max(max1 , leftd + rightd + root.val);
        return Math.max(left_d, right_d) + node.val;

        
    }
}