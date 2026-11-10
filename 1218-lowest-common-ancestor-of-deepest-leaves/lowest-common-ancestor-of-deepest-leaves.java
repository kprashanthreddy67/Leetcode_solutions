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
    int max=0;
    public void depth(TreeNode root,int d,HashMap<Integer,Integer> hm){
        if(root==null){
            return;
        }
        max=Math.max(max,d);
        hm.put(root.val,d);
        depth(root.left,d+1,hm);
        depth(root.right,d+1,hm);
    }
    public TreeNode check(TreeNode root,HashMap<Integer,Integer> hm){
         if(root==null){
            return null;
        }
        if(hm.get(root.val)==max){
            return root;
        }
        TreeNode left=check(root.left,hm);
        TreeNode right=check(root.right,hm);
        if(left==null){
            return right;
        }else if(right==null){
            return left;
        }else{
            return root;
        }
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        depth(root,0,hm);
        return check(root,hm);
       
    }
}