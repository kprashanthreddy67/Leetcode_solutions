class Solution {
    public int countGoodSubstrings(String s) {
        int l=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        int max=0;
        int cnt=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            if(r-l+1>3){
                char ch1=s.charAt(l);
                hm.put(ch1,hm.get(ch1)-1);
                if(hm.get(ch1)==0){
                    hm.remove(ch1);
                }
                l++;
            }
            if(hm.size()==3){
                cnt++;
            }
            
        }
        return cnt;
    }
}