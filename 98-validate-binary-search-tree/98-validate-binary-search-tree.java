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
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list);
        for(int i = 0;i<list.size()-1;i++) {
            if(list.get(i+1) <= list.get(i)){
                return false;
            }
        }
        return true;
        
    }
    public void dfs(TreeNode root,List<Integer> list) {
        if(root != null) {
           dfs(root.left,list);
            list.add(root.val);
            dfs(root.right,list);
        }
    }
}