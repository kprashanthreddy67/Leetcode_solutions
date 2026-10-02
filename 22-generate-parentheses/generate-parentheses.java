class Solution {
    public void check(int i,int n,String s,int open ,int close,List<String> ans){
        if(i>=(2*n)){
            ans.add(s);
            return ;
        }
        if(open<n){
            check(i+1,n,s+"(",open+1,close,ans);
        }
        if(close<open){
            check(i+1,n,s+")",open,close+1,ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        check(0,n,"",0,0,ans);
        return ans;
    }
}