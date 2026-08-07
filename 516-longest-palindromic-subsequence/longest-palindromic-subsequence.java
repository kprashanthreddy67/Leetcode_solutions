class Solution {
    public int check(int i,int j,String s,int dp[][]){
        if(i>j){
            return 0;
        }
        if(i==j){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]= 2+check(i+1,j-1,s,dp);
        }else{
            return dp[i][j]= Math.max(check(i+1,j,s,dp),check(i,j-1,s,dp));
        }
    }
    public int longestPalindromeSubseq(String s) {
        int dp[][]=new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            Arrays.fill(dp[i],-1);
        }
        return check(0,s.length()-1,s,dp);
    }
}