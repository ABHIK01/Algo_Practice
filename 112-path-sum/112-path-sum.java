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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return false;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer>  sum = new LinkedList<>();
        stack.add(root);
        sum.add(targetSum);
        
        while(!stack.isEmpty()){
            TreeNode current =  stack.poll();
            int currentVal = sum.poll() - current.val;
            
            if(current.left == null && current.right == null && currentVal == 0) {
                return true;
            }
            
            if(current.left != null){
                stack.add(current.left);
                sum.add(currentVal);
            }
            
            if(current.right != null){
                stack.add(current.right);
                sum.add(currentVal);
            }
            
        }
        
        return false;
    }
}