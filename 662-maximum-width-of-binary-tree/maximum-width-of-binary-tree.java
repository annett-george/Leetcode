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
 class pair{
    TreeNode node;
    long index;
    pair(TreeNode node, long index){
        this.node = node;
        this.index = index;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<pair> q = new LinkedList<>();
        if(root==null) return 0;
        long max=1;
        q.offer(new pair(root,1));
        while(!q.isEmpty()){
            int n = q.size();
            long first = q.peek().index;
            long last = first;
            for(int i=0; i<n; i++){
                pair p = q.poll();
                TreeNode node = p.node;
                long idx = p.index;
                last = idx;
                if(node.left!=null){
                    q.offer(new pair(node.left,2*idx+1));
                }
                if(node.right!=null){
                    q.offer(new pair(node.right,2*idx+2));
                }
            }
            max = Math.max(max, last-first+1);
        }
        return (int)max;
    }
}