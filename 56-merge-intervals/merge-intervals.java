class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]>ans=new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int[] list:intervals){
            int st=list[0];
            int en=list[1];
            if(st<=end){
                end=Math.max(en,end);
            }else{
                ans.add(new int[]{start,end});
                start=st;
                end=en;
            }
        }
        ans.add(new int[]{start,end});
        int res[][]=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;

    }
}