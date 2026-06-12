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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return inorder(p,q);
    }
    boolean inorder(TreeNode a, TreeNode b){
        if(a==null && b==null){
            return true;
        }
        if(a==null || b==null){
            return false;
        }
        if(a.val!=b.val){
            return false;
        }
        return inorder(a.left,b.left) && inorder(a.right,b.right);
    }
}