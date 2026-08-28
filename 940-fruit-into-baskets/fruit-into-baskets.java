class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int l=0;
        int max=0;
        for(int r=0;r<fruits.length;r++){
            int val=fruits[r];
            hm.put(val,hm.getOrDefault(val,0)+1);
            while(hm.size()>2){
                int val1=fruits[l];
                hm.put(val1,hm.get(val1)-1);
                if(hm.get(val1)==0){
                    hm.remove(val1);
                }
                l++;
            }
            // if(hm.size()==2){
                 max=Math.max(max,r-l+1);
            // }
        }
        return max;
    }
}