class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String res="";
        for(String word:dictionary){
            int i=0;
            int j=0;
            while(i<s.length() && j<word.length()){
                if(s.charAt(i)==word.charAt(j)){
                    i++;
                    j++;
                }else{
                    i++;
                }
                if(j==word.length()){
                    if(word.length()>res.length()){
                        res=word;
                    }else if(word.length()==res.length() && word.compareTo(res)<0){
                        res=word;
                    }
                }
            }
        }
        return res;
    }
}