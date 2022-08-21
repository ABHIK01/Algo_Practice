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
class BSTIterator {

        Queue<TreeNode> queue = new LinkedList<>();
    public BSTIterator(TreeNode root) {
        inOrder(root);
        
    }
    public void  inOrder(TreeNode root) {
        if(root != null){
            inOrder(root.left);
            queue.add(root);
            inOrder(root.right);
        }
    }
    
    public int next() {
        return queue.remove().val;
        
    }
    
    public boolean hasNext() {
        return queue.peek() != null;
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */