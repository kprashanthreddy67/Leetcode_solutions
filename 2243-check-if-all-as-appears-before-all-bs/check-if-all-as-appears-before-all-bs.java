class Solution {
    public boolean checkString(String s) {
        int cnt=0;
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            if(s.substring(i,i+2).equals("ba")){
                return false;
            }
        }
        return true;
    }
}