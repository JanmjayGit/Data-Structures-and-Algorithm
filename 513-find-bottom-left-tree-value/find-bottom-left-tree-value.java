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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
       
        if(root == null){
            return 0;
        }

        q.add(root);
        int leftmost = -1;

        // level oder traversel from right to left
        while(!q.isEmpty()){
            
            TreeNode temp = q.poll();

            leftmost = temp.val;
            if(temp.right != null){
                q.add(temp.right);
            }
            if(temp.left != null){
                q.add(temp.left);
            }

            

            
            
        }
        return leftmost;
    }
}