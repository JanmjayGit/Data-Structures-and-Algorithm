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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> currLevel = new ArrayList<>(levelSize);

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.poll();

                // Add the node value in zigzag order
                if (leftToRight) {
                    currLevel.add(node.val);
                } else {
                    currLevel.add(0, node.val); 
                }

                // Add children for the next level
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }

            ans.add(currLevel);
            leftToRight = !leftToRight; 
        }

        return ans;
    }
}
