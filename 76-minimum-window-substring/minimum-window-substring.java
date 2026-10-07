class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int l=0;
        int cnt=0;
        int min=Integer.MAX_VALUE;
        int sindex=-1;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            if(hm.containsKey(ch)){
                if(hm.get(ch)>0){
                    cnt++;
                }
                hm.put(ch,hm.get(ch)-1);
            }
            while(cnt==t.length()){
                if(r-l+1<min){
                    min=r-l+1;
                    sindex=l;
                }
                char left=s.charAt(l);
                if(hm.containsKey(left)){
                    hm.put(left,hm.get(left)+1);
                    if(hm.get(left)>0){
                        cnt--;
                    }
                }
                l++;
            }
        }
        return (sindex==-1)?"":s.substring(sindex,sindex+min);
    }
}