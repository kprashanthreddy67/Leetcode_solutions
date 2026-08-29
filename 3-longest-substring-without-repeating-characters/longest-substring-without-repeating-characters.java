class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int l=0;
        int max=0;
        int cnt=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            if(!hs.contains(ch)){
                hs.add(ch);
            }else{
                while(hs.contains(ch)){
                    char ch1=s.charAt(l);
                    hs.remove(ch1);
                    l++;
                }
                hs.add(ch);
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}