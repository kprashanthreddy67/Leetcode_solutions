class Solution {
    public int countCollisions(String directions) {
        int l=0;
        char arr[]=directions.toCharArray();
        int n=arr.length;
        int r=arr.length-1;
        int collision=0;
        while(l<n && arr[l]=='L'){
            l++;
        }
        while(r>=0 && arr[r]=='R'){
            r--;
        }
        while(l<=r){
            if(arr[l]!='S'){
                collision++;
            }
            l++;
        }
        return collision;
    }
}