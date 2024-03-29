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
        
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null){
            return result;
        }
        
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        boolean flag = true;
        while(!queue.isEmpty()) {
           LinkedList<Integer> level = new LinkedList<>();
            
            int size = queue.size();
            for(int i = 0;i<size;i++){
                TreeNode  node = queue.poll();
                if(node.left != null) {
                    queue.add(node.left);
                }
                
                if(node.right != null) {
                    queue.add(node.right);
                }
                
                if(flag){
                    level.add(node.val);
                }else {
                    level.addFirst(node.val);
                }
                
            }
            result.add(level);
            flag = !flag;
            
        }
        
        return result;
        
    }
}