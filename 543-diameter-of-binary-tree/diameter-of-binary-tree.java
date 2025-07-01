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
    public int diameterOfBinaryTree(TreeNode root) {
        int [] diameter = new int[1];
        maxDepth(root, diameter);
        return diameter[0];
        
        // int lh = maxDepth(root.left);
        // int rh = maxDepth(root.right);
        // int ans = lh + rh;
        
        // int leftdiameter = diameterOfBinaryTree(root.left);
        // int rightdiameter = diameterOfBinaryTree(root.right);

        // return Math.max(leftdiameter, Math.max(ans,rightdiameter));
    }

    public int maxDepth(TreeNode root, int[] diameter) {
        if(root == null){
            return 0;
        }
        int l = maxDepth(root.left, diameter);
        int r = maxDepth(root.right, diameter);
        diameter[0] = Math.max(diameter[0], l + r);
        return Math.max(l,r) + 1;
        
    }
}