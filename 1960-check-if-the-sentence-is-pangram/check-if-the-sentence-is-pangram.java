class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(char ch='a';ch<='z';ch++){
            if(hm.getOrDefault(ch,0)==0){
                return false;
            }
        }
        return true;
        // int freq[]=new int[26];
        // for(int i=0;i<sentence.length();i++){
        //     char ch=sentence.charAt(i);
        //     freq[ch-'a']++;
            
        // }
        // for(int i=0;i<26;i++){
        //     if(freq[i]==0){
        //         return false;
        //     }
        // }
        // return true;
        

    }
}