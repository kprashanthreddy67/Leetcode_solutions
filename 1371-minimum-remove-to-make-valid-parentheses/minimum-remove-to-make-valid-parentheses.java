class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb=new StringBuilder();
        int open=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                sb.append(ch);
            }else if(ch=='('){
                sb.append(ch);
                open++;
            }else if(ch==')'){
                if(open>0){
                    sb.append(ch);
                    open--;
                }
            }
        }
        for(int i=sb.length()-1;i>=0;i--){
            if(open>0){
                if(sb.charAt(i)=='('){
                    sb.deleteCharAt(i);
                    open--;
                }
            }
        }
        return sb.toString();
    }
}