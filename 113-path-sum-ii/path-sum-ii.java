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
    public void check(TreeNode root,int targetSum,List<List<Integer>> ans,List<Integer> res){
        if(root==null){
            return;
        }
        res.add(root.val);
        if(root.left==null && root.right==null){
            int sum=0;
            for(int i=0;i<res.size();i++){
                sum+=res.get(i);
            }
            if(sum==targetSum){
                ans.add(new ArrayList<>(res));
            }
        }
        check(root.left,targetSum,ans,res);
        check(root.right,targetSum,ans,res);
        res.remove(res.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> res=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        check(root,targetSum,ans,res);
        return ans;
    }
}