class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            ans.add(nums1[i]);

        }
        for(int i=0;i<nums2.length;i++){
            ans.add(nums2[i]);
        }
        Collections.sort(ans);
        int arr[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
        if(arr.length%2==1){
            return arr[arr.length/2];
        }else{
            return (arr[arr.length/2]+arr[arr.length/2-1])/2.0;
        }
        // int l=nums1.length-1;
        // int r=nums2.length-1;
        // int k=nums1.length+nums2.length-1;
        // int arr[]=new int[k+1];
        // while(l>=0 && r>=0){
        //     if(nums1[l]>=nums2[r]){
        //         arr[k--]=nums1[l--];
        //     }else{
        //         arr[k--]=nums2[r--];
        //     }
        // }
        // while(l>=0){
        //     arr[k--]=nums1[l--];
        // }
        // while(r>=0){
        //     arr[k--]=nums2[r--];
        // }
        
        // if(arr.length%2==1){
        //     return arr[arr.length/2];
        // }else{
        //     return (arr[arr.length/2]+arr[arr.length/2-1])/2.0;
        // }
        
    }
}