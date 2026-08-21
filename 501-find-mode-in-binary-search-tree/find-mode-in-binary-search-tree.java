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
    public void check(TreeNode root,List<Integer> ans){
        if(root==null){
            return;
        }
        check(root.left,ans);
        ans.add(root.val);
        check(root.right,ans);
    }
    public int[] findMode(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        check(root,ans);
        HashMap<Integer,Integer>hm=new HashMap<>();
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<ans.size();i++){
            int val=ans.get(i);
            hm.put(val,hm.getOrDefault(val,0)+1);
        }
        int max=0;
        for(int i:hm.keySet()){
            if(hm.get(i)>max){
                max=hm.get(i);
            }
        }
        for(int i:hm.keySet()){

            if(max==hm.get(i)){
                res.add(i);
            }
        }
        int arr[]=new int[res.size()];
        for(int i=0;i<res.size();i++){
           arr[i]=res.get(i);
        }
        return arr;
    }
}