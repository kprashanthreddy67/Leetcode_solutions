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
    
    public boolean check(TreeNode root,int ans,int targetSum){
        if(root==null){
            return false;
        }
        ans+=root.val;
        if(root.left==null && root.right==null){
            if(ans==targetSum){
                return true;
            }
        }
         return check(root.left,ans,targetSum) ||check(root.right,ans,targetSum);

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return check(root,0,targetSum);
    }
}