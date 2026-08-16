class Solution {
    public int check(int i,int j,String text1,String text2,int dp[][]){
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(text1.charAt(i)==text2.charAt(j)){
            return dp[i][j]= 1+check(i-1,j-1,text1,text2,dp);
        }else{
            return dp[i][j]= Math.max(check(i-1,j,text1,text2,dp),check(i,j-1,text1,text2,dp));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int dp[][]=new int[n][m];
        for(int i=0;i<text1.length();i++){
            Arrays.fill(dp[i],-1);
        }
        return check(text1.length()-1,text2.length()-1,text1,text2,dp);
    }
}