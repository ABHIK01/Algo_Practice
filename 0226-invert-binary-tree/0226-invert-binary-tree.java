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
    public TreeNode invertTree(TreeNode root) {
        
        if(root == null) {
            return null;
        }
        
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        
        while(!list.isEmpty()) {
            TreeNode current = list.poll();
            
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;
            
            if(current.left != null){
                list.add(current.left);
            }
            
            if(current.right != null) {
                list.add(current.right);
            }
        }
        
        return root;
        
    }
}