class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num=1;
        int i=0;
        while(k>0){
            if(i<arr.length && num==arr[i]){
                i++;
            }else{
                k--;
                if(k==0){
                    return num;
                }    
            }
            // i++;
            num++;
        }
        return 0;
    }
}