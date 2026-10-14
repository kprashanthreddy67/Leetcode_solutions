class Solution {
    public String orderlyQueue(String s, int k) {
        char arr[]=new  char[s.length()];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[i]=ch;
        }
        if(k>1){
            Arrays.sort(arr);
            String temp=new String(arr);
            return temp;

        }
        if(k==1){
            String res=s;

            for(int i=0;i<arr.length;i++){
                char first=arr[0];
                for(int j=0;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                arr[arr.length-1]=first;
                String temp=new String(arr);
                if(temp.compareTo(res)<0){
                    res=temp;
                }
            }
            return res;
        }
        return "";
    }
}