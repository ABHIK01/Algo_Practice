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
    public int sumEvenGrandparent(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        TreeNode current = root;
        sum(current,list);
        
        int sum = 0;
        for(Integer val: list) {
            sum += val;
        }
        return sum;
    }
    
    
    public void sum(TreeNode current,List<Integer> list) {
        if(current != null ) {
            if( current.val %2 == 0){
                if(current.left != null) {
                    if(current.left.left != null) {
                        list.add(current.left.left.val );
                    }  if(current.left.right != null) {
                        list.add(current.left.right.val);
                    }
                }
                
                 if(current.right != null) {
                    if(current.right.left != null) {
                        list.add(current.right.left.val );
                    }  if(current.right.right != null) {
                        list.add(current.right.right.val);
                    }
                }
            }
             sum( current.left,list);
            sum( current.right,list);
        }
       
            
        
        
    }
}