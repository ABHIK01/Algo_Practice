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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        LinkedList<TreeNode> list = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();
        
        if(root == null) {
            return result;
        }
        
        list.add(root);
        
        while(!list.isEmpty()) {
            TreeNode node = list.pollLast();
            result.add(node.val);
            
            if(node.right != null) {
                list.add(node.right);
            }
            
            if(node.left != null) {
                list.add(node.left);
            }
        }
        
        return result;
        
        
        
    }
}