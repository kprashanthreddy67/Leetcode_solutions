class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        int  l=0;
        int max=0;
        int cnt=0;
        int k=p.length();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            hm1.put(ch,hm1.getOrDefault(ch,0)+1);
        }
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            hm2.put(ch,hm2.getOrDefault(ch,0)+1);
            if(r-l+1>k){
                char ch1=s.charAt(l);
                hm2.put(ch1,hm2.get(ch1)-1);
                if(hm2.get(ch1)==0){
                    hm2.remove(ch1);
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