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
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }
        Integer maxWidth = 0;
      LinkedList<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        
        queue.add(new Pair<>(root,0));
        
        while(queue.size() > 0) {
            Pair<TreeNode,Integer> first = queue.getFirst();

            Integer levelSize = queue.size();
             Pair<TreeNode, Integer> elem = null;
            for(int i = 0;i<levelSize;i++) {
                elem = queue.poll();
                TreeNode node = elem.getKey();
                if(node.left != null) {
                    queue.add(new Pair<>(node.left,2 * elem.getValue()+1));
                }
                
                if(node.right != null) {
                    queue.add(new Pair<>(node.right,2 * elem.getValue()+2));
                }
            }
            
            maxWidth = Math.max(maxWidth,elem.getValue() -  first.getValue() +1);
        }
        
        return maxWidth;
        
    }
}