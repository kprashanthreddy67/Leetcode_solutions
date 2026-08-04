class Solution {
    public String decodeString(String s) {
        Stack<Integer> num1=new Stack<>();
        Stack<String> str=new Stack<>();
        String curr="";
        int num=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }else if(ch=='['){
                num1.push(num);
                str.push(curr);
                curr="";
                num=0;

            }else if(ch==']'){
                int repeat=num1.pop();
                String prev=str.pop();
                String temp="";
                for(int j=0;j<repeat;j++){
                    temp+=curr;
                }
                curr=prev+temp;

            }else{
                curr+=ch;
            }
        }
        return curr;
    }
}