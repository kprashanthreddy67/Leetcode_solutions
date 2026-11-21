class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int i=0;
        List<int[]> ans=new ArrayList<>();
        while(i<intervals.length && intervals[i][1]<newInterval[0]){
            ans.add(intervals[i]);
            i++;
        }
        while(i<intervals.length && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        ans.add(newInterval);
        while(i<intervals.length){
            ans.add(intervals[i]);
            i++;
        }
        int res[][]=new int[ans.size()][2];
        for(int j=0;j<ans.size();j++){
            res[j]=ans.get(j);
        }
        return res;

    }
}