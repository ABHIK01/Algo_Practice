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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if(root == null) return result;
        
        LinkedList<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);
        
        while(!treeNodes.isEmpty()) {
            int size = treeNodes.size();
            for(int i = 0;i<size;i++){
                TreeNode node = treeNodes.poll();
                if(i == size-1){
                    result.add(node.val);
                }
                if(node.left != null) {
                    treeNodes.add(node.left);
                }
                
                if(node.right != null) {
                    treeNodes.add(node.right);
                }
            }
        }
        
        return result;
        
    }
}