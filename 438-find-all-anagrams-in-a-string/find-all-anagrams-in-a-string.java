class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Character,Integer> hm1=new HashMap<>();
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            hm1.put(ch,hm1.getOrDefault(ch,0)+1);
        }
        int l=0;
        int k=p.length();
        HashMap<Character,Integer> hm2=new HashMap<>();
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            hm2.put(ch,hm2.getOrDefault(ch,0)+1);
            if(r-l+1>k){
                char rem=s.charAt(l);
                hm2.put(rem,hm2.get(rem)-1);
                if(hm2.get(rem)==0){
                    hm2.remove(rem);
                }
                l++;
            }
            if(r-l+1==k){
                if(hm1.equals(hm2)){
                ans.add(l);
                }
            }
        }
        return ans;
    }
}