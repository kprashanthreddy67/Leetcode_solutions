class Solution {
    public int maxVowels(String s, int k) {
        int l=0;
        int max=0;
        int cnt=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                cnt++;
            }
            while(r-l+1>k){
                char ch1=s.charAt(l);
                if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u'){
                    cnt--;
                }
                l++;
            }
            if(r-l+1==k){
                max=Math.max(max,cnt);
            }
        }
        return max;
    }
}