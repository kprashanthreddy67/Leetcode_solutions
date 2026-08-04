class Solution {
    public String greatestLetter(String s) {
        boolean[] lower=new boolean[26];
        boolean[] upper =new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                lower[ch-'a']=true;
            }else if(ch>='A' && ch<='Z'){
                upper[ch-'A']=true;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=25;i>=0;i--){
            if(lower[i]==true && upper[i]==true){
               return String.valueOf((char) ('A' + i));
            }
        }
        return "";
        // return sb.toString();
    }
}