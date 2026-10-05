class Solution {
    public int scoreOfParentheses(String s) {
        int score=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(score);
                score=0;
            }else if(ch==')'){
                int prev=st.pop();
                if(score==0){
                    score=1;
                }else{
                    score=2*(score);
                }
                score=prev+score;
            }
        }
        return score;
        
    }
}