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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i],i);
        }
        return build(postorder,0,postorder.length-1,inorder,0,inorder.length-1,map);
    }
    public TreeNode build(int[] postorder, int pstart, int pend, int[] inorder, int istart, int iend, Map<Integer,Integer> map){
        if(pstart>pend || istart>iend){
            return null;
        }
        TreeNode root = new TreeNode(postorder[pend]);
        int iroot = map.get(root.val);
        int numsleft = iroot-istart;
        root.left = build(postorder, pstart, pstart+numsleft-1, inorder, istart, iroot-1,map);
        root.right = build(postorder, pstart+numsleft, pend-1, inorder, iroot+1, iend, map);
        return root;

    }
}