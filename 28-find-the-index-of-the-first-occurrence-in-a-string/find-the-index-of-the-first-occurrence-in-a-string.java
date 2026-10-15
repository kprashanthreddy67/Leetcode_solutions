class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<=haystack.length()-needle.length();i++){
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
                if(j==needle.length()-1){
                    return i;
                }
            }
        }
        return -1;
        // int l=0;
        // int r=0;
        // while(l<haystack.length() && r<needle.length()){
        //     if(haystack.charAt(l+r)==needle.charAt(r)){
        //         // l++;
        //         r++;
        //     }else{
        //         r=0;
        //         l++;
                
        //     }
        //     if(r==needle.length()){
        //         return l;
        //     }
        // }
        // return -1;
    }
}