class Solution {
    public String greatestLetter(String s) {
        int freq[]=new int[52];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                freq[ch-'a']++;
            }else{
                freq[ch-'A'+26]++;
            }
        }
        for(int i=25;i>=0;i--){
            if(freq[i]>0 && freq[i+26]>0){
                return  String.valueOf((char) ('A' + i));
            }
        }
        return "";
    }
}