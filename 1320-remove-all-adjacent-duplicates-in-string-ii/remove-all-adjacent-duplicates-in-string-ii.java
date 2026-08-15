class Solution {
    class Pair{
        char ch;
        int freq;
        Pair(char ch,int freq){
            this.ch=ch;
            this.freq=freq;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty()){
                st.push(new Pair(ch,1));
            }else if(st.peek().ch==ch){
                st.peek().freq++;
                if(st.peek().freq==k){
                    st.pop();
                }
            }else{
                st.push(new Pair(ch,1));
            }
        }
        while(!st.isEmpty()){
            Pair pd=st.pop();
            for(int i=0;i<pd.freq;i++){
                sb.append(pd.ch);
            }
        }
        return sb.reverse().toString();
    }
}