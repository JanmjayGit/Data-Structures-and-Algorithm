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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>(); // 2 D list to store value level by level

        if(root == null){
            return new ArrayList<>();
        }
        int c = 1;
        q.add(root);
        List<Integer> currlevel = new ArrayList<>();

        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            currlevel.add(temp.val);
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
            c--;

            if(c == 0){
                c = q.size();
                ans.add(currlevel);
                currlevel = new ArrayList<>();
            }
        }
        return ans;
    }
}