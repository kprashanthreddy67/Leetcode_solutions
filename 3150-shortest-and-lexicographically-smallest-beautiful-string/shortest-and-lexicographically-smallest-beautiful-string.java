class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
         String res="";
        for(int len=k;len<=s.length();len++){
           
            // int cnt=0;
            for(int i=0;i<=s.length()-len;i++){
                int cnt=0;
                // char ch=s.charAt(i)-'0';
                String temp=s.substring(i,i+len);
                for(int j=0;j<temp.length();j++){
                    int ch=temp.charAt(j)-'0';
                    if(ch==1){
                        cnt++;
                    }
                }
                if(cnt==k){
                    if(res.length()==0 ||temp.compareTo(res) < 0){
                        res=temp;
                    }
                }
            }
            if(res.length()>0){
            return res;
            }
        }
        
            return "";
        
    }
}