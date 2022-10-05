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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth  == 1) {
            TreeNode node = new TreeNode(val);
           node.left = root;
            return node;
        }
        insert(1,depth,val,root);
        return root;
    }
    
    public void insert(int currentDepth,int depth,int val,TreeNode node ){
        if(node == null) {
            return;
        }
        if(currentDepth == depth-1){
            TreeNode temp =  node.left;
            node.left =  new TreeNode(val);
            node.left.left = temp;
            
             temp =  node.right;
            node.right =  new TreeNode(val);
            node.right.right = temp;
            
            
            
        } else {
            insert( currentDepth+1, depth, val, node.left);
            insert( currentDepth+1, depth, val, node.right );
        }
    }
}