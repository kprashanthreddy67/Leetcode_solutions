class Solution {
    public int check(int i,int j,String word1,String word2,int dp[][  ]){
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(word1.charAt(i)==word2.charAt(j)){
            return dp[i][j]= 1+check(i-1,j-1,word1,word2,dp);
        }else{
            return dp[i][j]= Math.max(check(i-1,j,word1,word2,dp),check(i,j-1,word1,word2,dp));
        }
    }
    public int minDistance(String word1, String word2) {
        int dp[][]=new int [word1.length()][word2.length()];
        for(int i=0;i<word1.length();i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=check(word1.length()-1,word2.length()-1,word1,word2,dp);
        return word1.length()+word2.length()-(2*ans);
    }
}