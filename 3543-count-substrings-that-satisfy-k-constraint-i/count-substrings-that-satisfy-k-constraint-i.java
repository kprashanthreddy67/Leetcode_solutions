class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int l=0;
        int ans=0;
        int cnt0=0;
        int cnt1=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
           if(ch=='0'){
            cnt0++;
           }
           if(ch=='1'){
            cnt1++;
           }
            while((cnt0)>k && cnt1>k){
                if(s.charAt(l)=='0'){
                    cnt0--;
                }else{
                    cnt1--;
                }
                l++;
            }
            if(cnt0<=k || cnt1<=k){
                ans+=r-l+1;
            }
        }
        return ans;
    }
}