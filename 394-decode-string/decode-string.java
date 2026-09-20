class Solution {
    public String decodeString(String s) {
        Stack<Integer> stnum=new Stack<>();
        Stack<String> str=new Stack<>();
        int num=0;;
        String curr=""; 
        for(int  i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }else if(ch== '['){
                stnum.push(num);
                str.push(curr);
                num=0;
                curr="";
            }else if(ch==']'){
                int freq=stnum.pop();

                String  prev=str.pop();
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