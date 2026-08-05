class Solution {
    public long countSubstrings(String s, char c) {
        int freq[]=new int[26];
        long cnt=0;
        long max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==c){
                cnt++;
                max+=cnt;
            }
            
        }
        return  max;
    }
}