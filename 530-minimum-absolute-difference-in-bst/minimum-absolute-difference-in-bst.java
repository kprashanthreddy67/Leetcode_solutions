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
    public void check(TreeNode root,List<Integer>ans){
        if(root==null){
            return;
        }

        check(root.left,ans);
        ans.add(root.val);
        check(root.right,ans);
    }
    public int getMinimumDifference(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        check(root,ans);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<ans.size();i++){
            min=Math.min(min,(ans.get(i)-ans.get(i-1)));
        }
        return min;
    }
}