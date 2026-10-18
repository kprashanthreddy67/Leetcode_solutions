class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int  l=1;l<=s.length()/2;l++){
            if(n%l==0){
                int times=n/l;
                String str=s.substring(0,l);
                String temp="";
                for(int i=0;i<times;i++){
                    temp+=str;
                }
                if(temp.equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}