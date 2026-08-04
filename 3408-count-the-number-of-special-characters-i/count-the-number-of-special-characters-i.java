class Solution {
    public int numberOfSpecialChars(String word) {
        int[] lower=new int[52];
        int cnt=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='a' && ch<='z'){
                lower[ch-'a']++;
            }else{
                lower[ch-'A'+26]++;
            }
        }
        for(int i=0;i<26;i++){
            if(lower[i]>0 && lower[i+26]>0){
                cnt++;
            }
        }
        return cnt;
    }
}