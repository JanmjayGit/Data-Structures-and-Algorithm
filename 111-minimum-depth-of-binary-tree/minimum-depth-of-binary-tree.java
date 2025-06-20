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
    public int minDepth(TreeNode root) {
        //janmjay
        if(root == null){
            return 0;
        }

        int depth = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root); // adding root to queue

        // level order traversal approach
        while(!q.isEmpty()){
            int size = q.size();
            for(int i =0; i< size; i++){
                TreeNode temp = q.poll();

                if(temp.left == null && temp.right == null){
                    return depth;  // leaf node found at minimum level 2
                }
                if(temp.left != null){
                    q.offer(temp.left);
                }
                if(temp.right != null){
                    q.offer(temp.right);
                }
            }
            depth++;
        }
        return depth;
    }
}