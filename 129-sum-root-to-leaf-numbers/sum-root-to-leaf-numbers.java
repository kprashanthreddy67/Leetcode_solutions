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
    public void  check(TreeNode root,int curr,List<Integer> ans){
        if(root==null){
            return;
        }
        curr=curr*10+root.val;
        if(root.left==null && root.right==null){
            ans.add(curr);
        }
        check(root.left,curr,ans);
        check(root.right,curr,ans);
    }
    public int sumNumbers(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        check(root,0,ans);
        int sum=0;
        for(int i=0;i<ans.size();i++){
            sum+=ans.get(i);
        }
        return sum;
    }
}