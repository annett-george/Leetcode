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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null){
            return null;
        }
        Queue<TreeNode> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        q.offer(root);
        boolean flag = false;
        while(!q.isEmpty()){
            int n = q.size();
            if(flag){
                for(int i=0; i<n; i++){
                    TreeNode p = q.poll();
                    p.val = st.pop();
                    if(p.left!=null){
                        q.offer(p.left);
                        q.offer(p.right);
                    }
                }
            }
            else{
                for(int i=0; i<n; i++){
                    TreeNode p = q.poll();
                    if(p.left!=null){
                        q.offer(p.left);
                        st.push(p.left.val);
                        q.offer(p.right);
                        st.push(p.right.val);
                    }
                }
            }

            flag=!flag;
        }
        return root;
    }
}