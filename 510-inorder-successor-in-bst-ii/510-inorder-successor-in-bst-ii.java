/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/
//T.C=O(H)
//S.C=O(1)
class Solution {
    public Node inorderSuccessor(Node node) {
        if(node.right != null) {
            node = node.right;
            while(node.left != null) {
                node = node.left;
            }
             return node;
        }
        
        
        while(node.parent != null && node == node.parent.right) {
            node = node.parent;
        }
        return node.parent;
       
        
        
    }
}