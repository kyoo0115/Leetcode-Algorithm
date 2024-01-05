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
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

     private boolean isValidBST(TreeNode node, Integer min, Integer max) {
        // Base case: an empty tree is a valid BST
        if (node == null) {
            return true;
        }

        // Check the current node's value against the min and max constraints
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }
        // Recursively check the left and right subtrees
        // Update max for the left subtree and min for the right subtree
        return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
    }
}