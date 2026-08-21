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
    int ans=0;
    public void check(TreeNode root,boolean isleft){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null && isleft){
            ans+=root.val;
        }
        check(root.left,true);
        check(root.right,false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
         check(root,false);
         return ans;
    }
}