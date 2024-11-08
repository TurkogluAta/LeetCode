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
    public int maxDepth(TreeNode root) {
        
        // If the node is empty, the depth is 0.
        if (root == null) {
            return 0; 
        }
        
        // Recursively calculate the depths of the left and right subtrees
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        // Take the larger of the left and right depths and add 1 (for the current node)
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
