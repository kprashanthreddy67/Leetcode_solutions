class Solution {
    public int minSwaps(String s) {
        int open=0;
        int close=0;
        int answer=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='['){
                open++;
            }else{
                close++;
            }
            max=Math.max(max,close-open);
        }
        answer=(max+1)/2;
        return answer;

    }
}