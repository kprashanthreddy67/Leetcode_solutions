class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        // int l=0
        String cnt="";
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
                    if(word.length()>cnt.length()){
                        cnt=word;
                    }else if(cnt.length()==word.length() && word.compareTo(cnt)<0){
                        cnt=word;
                    }
                 }
           }

        }
        return cnt;
    }
}