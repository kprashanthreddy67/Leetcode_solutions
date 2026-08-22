class Solution {
    public boolean checkDivisibility(int n) {
        String s=String.valueOf(n);
        int sum=0;
        int mul=1;
        int ans=0;
        for(int i=0;i<s.length();i++){
            int val=s.charAt(i)-'0';
            sum+=val;
            mul*=val;
        }
        
        ans+=sum;
        ans+=mul;
        if(n%ans==0){
            return true;
        }
        return false;
    }
}