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
    
    public boolean check(TreeNode root,int targetSum,List<Integer> ans){
        if(root==null){
            return false;
        }
        ans.add(root.val);
        if(root.left==null && root.right==null){
            int sum=0;
            for(int i=0;i<ans.size();i++){
                sum+=ans.get(i);
            }
            if(sum==targetSum){
                return true;
            }
        }
        boolean left=check(root.left,targetSum,ans);
        boolean right=check(root.right,targetSum,ans);
        ans.remove(ans.size()-1);
        return left || right;  
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        List<Integer> ans=new ArrayList<>();
        return check(root,targetSum,ans);
    }
}