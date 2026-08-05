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
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            Pair p=st.pop();
            for(int i=0;i<p.freq;i++){
                sb.append(p.ch);
            }
        }
        return sb.reverse().toString();
    }
}