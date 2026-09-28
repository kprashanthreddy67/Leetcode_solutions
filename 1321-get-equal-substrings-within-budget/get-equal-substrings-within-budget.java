class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
     int ans=0;
     int l=0;
     int sum=0;
     for(int r=0;r<s.length();r++){
        char ch=s.charAt(r);
        char ch1=t.charAt(r);
        sum+=Math.abs(ch-ch1);
        while(sum>maxCost){
            sum-=Math.abs(s.charAt(l)-t.charAt(l));
            l++;
        }
        ans=Math.max(ans,r-l+1);
     }   

     return ans;
    }
}