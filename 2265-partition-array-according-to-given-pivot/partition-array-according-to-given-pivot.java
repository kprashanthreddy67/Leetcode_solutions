class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less=new ArrayList<>();
        List<Integer> eq=new ArrayList<>();
        List<Integer> high=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                less.add(nums[i]);
            }
            else if(nums[i]==pivot){
                eq.add(nums[i]);
            }
            else{

                high.add(nums[i]);
            }
        }
        int arr[]=new int[nums.length];
        int j=0;
        for(int i=0;i<less.size();i++){
            arr[j]=less.get(i);
            j++;
        }
        for(int i=0;i<eq.size();i++){
            arr[j]=eq.get(i);
            j++;
        }
        for(int i=0;i<high.size();i++){
            arr[j]=high.get(i);
            j++;
        }
        return arr;
    }
}