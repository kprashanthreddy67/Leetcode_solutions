class Solution {
    public String removeOuterParentheses(String s) {

    //  Stack<Character> st=new Stack<>();
    StringBuilder sb=new StringBuilder();
     int score=0;
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='('){
            if(score>0){
                sb.append(ch);
            }
            score++;
        }else if(ch==')'){
            score--;
            if(score>0){
                sb.append(ch);
            }
        }
     }   
     return sb.toString();
    }
}