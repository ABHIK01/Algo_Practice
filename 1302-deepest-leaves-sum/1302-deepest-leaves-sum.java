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
    public int deepestLeavesSum(TreeNode root) {
        int maxDepth = getMaxDepth(root);
        return dfs(root,1,maxDepth);
        
    }
    
    public int getMaxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        int left = getMaxDepth( root.left) ;
        int right = getMaxDepth( root.right);
        return Math.max(left,right) + 1;
    }
    
    public int dfs(TreeNode root,int level,int maxDepth) {
        if(root == null) {
            return 0;
        }
        if(level == maxDepth) {
            return root.val;
        }
        int left  = dfs( root.left, level+1, maxDepth);
        int right = dfs( root.right, level+1, maxDepth);
        return left + right;
    }
}