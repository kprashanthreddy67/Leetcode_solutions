class Solution {
    public String reverseParentheses(String s) {
        Stack<String> st=new Stack<>();
        String curr="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(curr);
                curr="";
            }else if(ch==')'){
                String prev=st.pop();
                String temp="";
                for(int j=curr.length()-1;j>=0;j--){
                    temp+=curr.charAt(j);
                }
                curr=prev+temp;
                
            }else{
                curr+=ch;
            }
            
        
        }
        return curr;
    }
}