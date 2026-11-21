class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i[]:intervals){
            int st=i[0];
            int en=i[1];
            if(st<=end){
                start=Math.min(start,st);
                end=Math.max(end,en);

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