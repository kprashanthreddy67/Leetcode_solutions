class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int l=0;
        int max=0;
        int sum=0;
        for(int r=0;r<s.length();r++){
            char ch1=s.charAt(r);
            char ch2=t.charAt(r);
             sum+=Math.abs(ch1-ch2);
            
            while(sum>maxCost){
                sum-=Math.abs(s.charAt(l)-t.charAt(l));
                    l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}