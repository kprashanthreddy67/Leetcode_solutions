class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        int score=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(score>0){
                    st.push(ch);
                }
                score++;
            }else if(ch==')'){
                score--;
                if(score>0){
                    st.push(ch);
                }
            }
        }
        for(char i:st){
            sb.append(i);
        }
        return sb.toString();
    }
}