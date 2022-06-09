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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        if(root == null) {
            return false;
        }
        
        boolean result = false; 
        if(root.val == subRoot.val) {
            result = istheSame(root,subRoot);
        }
        
        return result || isSubtree( root.left,  subRoot) || isSubtree( root.right,  subRoot);
        
    }
    
    public boolean istheSame(TreeNode root,TreeNode subRoot) {
        
        if(root == null && subRoot == null) {
            return true;
        }
        if(root == null) {
            return false;
        }
        
        if(subRoot == null) {
            return false;
        }
        
        if(root.val != subRoot.val){
            return false;
        }
        
        return istheSame(root.left,subRoot.left) && istheSame(root.right,subRoot.right);
    }
}