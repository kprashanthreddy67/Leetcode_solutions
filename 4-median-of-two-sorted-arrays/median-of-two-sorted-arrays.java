class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l=nums1.length-1;
        int r=nums2.length-1;
        int k=nums1.length+nums2.length-1;
        int arr[]=new int[k+1];
        while(l>=0 && r>=0){
            if(nums1[l]>=nums2[r]){
                arr[k--]=nums1[l--];
            }else{
                arr[k--]=nums2[r--];
            }
        }
        while(l>=0){
            arr[k--]=nums1[l--];
        }
        while(r>=0){
            arr[k--]=nums2[r--];
        }
        
        if(arr.length%2==1){
            return arr[arr.length/2];
        }else{
            return (arr[arr.length/2]+arr[arr.length/2-1])/2.0;
        }
        
    }
}