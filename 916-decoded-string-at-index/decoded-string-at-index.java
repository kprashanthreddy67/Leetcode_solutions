class Solution {
    public String decodeAtIndex(String s, int k) {
       long len=0;
       for(int i=0;i<s.length();i++){
         char ch=s.charAt(i);
         if(Character.isLetter(ch)){
            len++;
         }else if(Character.isDigit(ch)){
            len*=ch-'0';
         }
       }
       for(int i=s.length()-1;i>=0;i--){
        char ch=s.charAt(i);
            k=(int)(k%len);
           if(k==0 && Character.isLetter(ch)){
            return String.valueOf(ch);
           }
           if(Character.isDigit(ch)){
            len/=ch-'0';
           }else{
            len--;
           }
           

       }
       return "";
    }
}