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
    public TreeNode sortedArrayToBST(int[] nums) {
        return tree(nums, 0, nums.length - 1);
    }

    // Helper method
    private TreeNode tree(int[] nums, int left, int right) {
        if (left > right){
            // Array is empty, no nodes
            return null;
        }

        // Find the middle element
        int mid = left + (right - left) / 2;

        // Set the middle element as the root
        TreeNode root = new TreeNode(nums[mid]);

        // Creating the left subtree
        root.left = tree(nums, left, mid - 1);

        // Creating the right subtree
        root.right = tree(nums, mid + 1, right);

        return root;
    }
}