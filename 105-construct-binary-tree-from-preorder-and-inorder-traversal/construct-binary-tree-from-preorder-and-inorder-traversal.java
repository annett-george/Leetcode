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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i],i);
        }
        TreeNode root = build(preorder,0,preorder.length-1,inorder,0,inorder.length-1, map);
        return root;
    }
    public TreeNode build(int[] preorder, int pstart,int pend, int[] inorder, int istart, int iend, HashMap<Integer,Integer> map){
        if(pstart>pend || istart>iend){
            return null;
        }
        TreeNode root = new TreeNode(preorder[pstart]);
        int iroot = map.get(root.val);
        int numsleft = iroot-istart;
        root.left = build(preorder,pstart+1,pstart+numsleft,inorder,istart,iroot-1, map);
        root.right = build(preorder, pstart+numsleft+1, pend, inorder, iroot+1, iend, map);
        return root;
    }
}