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
        List<Integer> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        
        if(root == null) {
            return result;
        }
        
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.pollLast();
            result.add(node.val);
            
            if(node.right != null) {
                queue.add(node.right);
            }
            
            if(node.left != null) {
                queue.add(node.left);
            }
        }
        
        
        
        return result;
    
        
    }
}