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
    public void check(TreeNode root,int min,int max){
        if(root==null)return;
        ans=Math.max(ans,Math.abs(root.val-min));
        ans=Math.max(ans,Math.abs(root.val-max));
        min=Math.min(root.val,min);
        max=Math.max(root.val,max);
        check(root.left,min,max);
        check(root.right,min,max);
    }
    public int maxAncestorDiff(TreeNode root) {
        check(root,root.val,root.val);
        return ans;
    }
}