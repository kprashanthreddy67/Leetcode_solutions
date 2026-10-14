class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        for(int i=0;i<word1.length();i++){
            char ch=word1.charAt(i);
            hm1.put(ch,hm1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<word2.length();i++){
            char ch=word2.charAt(i);
            hm2.put(ch,hm2.getOrDefault(ch,0)+1);

        }
        if(!hm1.keySet().equals(hm2.keySet())){
            return false;
        }
        List<Integer> list1=new ArrayList<>(hm1.values());
        List<Integer> list2=new ArrayList<>(hm2.values());
        Collections.sort(list1);
        Collections.sort(list2);
        if(list1.equals(list2)){
            return true;
        }
        return false;
    }

}