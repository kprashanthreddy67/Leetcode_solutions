class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0) continue;
            for(int j=0;j<digits.length;j++){
                if(j==i) continue;

                for(int k=0;k<digits.length;k++){
                    if(k==i || k==j) continue;
                    if(digits[k]%2!=0) continue;
                    int num=(digits[i]*100)+(digits[j]*10)+(digits[k]);
                    hs.add(num);
                }
            }
        }
        int arr[]=new int[hs.size()];
        int ind=0;
        for(int i:hs){
            arr[ind++]=i;
        }
        Arrays.sort(arr);
        return arr;
    }
}