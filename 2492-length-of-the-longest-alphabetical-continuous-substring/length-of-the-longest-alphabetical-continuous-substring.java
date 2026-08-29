class Solution {
    public int longestContinuousSubstring(String s) {
        int cnt=1;
        int max=1;
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.charAt(i)-s.charAt(i-1)==1){
                cnt+=1;
            }else{
                cnt=1;
            }
            max=Math.max(max,cnt);
        }
        return max;
    }
}