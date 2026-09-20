class Solution {
    public String decodeString(String s) {
        Stack<Integer> num=new Stack<>();
        Stack<String> str=new Stack<>();
        int nu=0;
        String curr="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                nu=nu*10+(ch-'0');
            }else if(ch=='['){
                num.push(nu);
                str.push(curr);
                nu=0;
                curr="";
            }else if(ch==']'){
                int freq=num.pop();
                String prev=str.pop();
                String temp="";
                for(int j=0;j<freq;j++){
                    temp=temp+curr;
                }
                curr=prev+temp;
            }else{
                curr+=ch;
            }

        }
        return curr;
    }
}