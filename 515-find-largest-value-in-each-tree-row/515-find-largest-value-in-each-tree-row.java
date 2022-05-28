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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        if(root == null) {
            return list;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            int largest = Integer.MIN_VALUE;
            for(int i = 0;i<size;i++) {
                TreeNode node = queue.poll();
                if(node.val > largest) {
                    largest = node.val;
                }
                
                if(node.left != null) {
                    queue.add(node.left);
                }
                
                if(node.right != null) {
                    queue.add(node.right);
                }
                
            }
            list.add(largest);
        }
        return list;
    }
}