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
    public TreeNode bstFromPreorder(int[] preorder) {
        return buildTree(preorder,new int[]{0},Integer.MAX_VALUE);
    }
    public TreeNode buildTree(int[] preorder, int[] idx, int bound){
        if(idx[0]>=preorder.length || preorder[idx[0]]>bound){
        return null;
        }
        TreeNode root = new TreeNode(preorder[idx[0]++]);
        root.left = buildTree(preorder,idx,root.val);
        root.right = buildTree(preorder,idx,bound);
        return root;
    }
}