class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String curr="";
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
                    if(word.length()>curr.length()){
                        curr=word;
                    }else if(word.length()==curr.length() && word.compareTo(curr)<0){
                        curr=word;
                    }
                }
            }
        }
        return curr;
    }
}