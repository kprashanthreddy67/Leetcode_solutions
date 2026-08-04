class Solution {
    public int numberOfSpecialChars(String word) {
        int freq[]=new int[52];
        int lower[]=new int[26];
        int upper[]=new int[26];
        Arrays.fill(upper,-1);
        int cnt=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='a' && ch<='z'){
                freq[ch-'a']++;
                lower[ch-'a']=i;
            }else{
                freq[ch-'A'+26]++;
                if(upper[ch-'A']==-1){
                    upper[ch-'A']=i;
                }
            }
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0 && freq[i+26]>0 && lower[i]<upper[i]){
                cnt++;
            }

        }
        return cnt;
    }
}