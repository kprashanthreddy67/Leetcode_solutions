class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int l=0;
        int tr=0;
        int fl=0;
        int max=0;
        for(int r=0;r<answerKey.length();r++){
            char ch=answerKey.charAt(r);
            if(ch=='T'){
                tr++;
            }else{
                fl++;
            }
            while(Math.min(tr,fl)>k){
                char ch1=answerKey.charAt(l);
                if(ch1=='T'){
                    tr--;
                }else{
                    fl--;
                }
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}