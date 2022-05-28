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
    public int sumNumbers(TreeNode root) {
       Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> list = new LinkedList<>();
        
        queue.offer(root);
        list.offer(0);
        
        int sum = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0;i<size;i++) {
                TreeNode node = queue.poll();
                int n = node.val + list.poll() * 10;
                if(node.left != null) {
                    queue.offer(node.left);
                    list.add(n);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                    list.add(n);
                }
                
                if(node.left == null && node.right == null) {
                    sum += n;
                }
            }
        }
        return sum;
    }
}