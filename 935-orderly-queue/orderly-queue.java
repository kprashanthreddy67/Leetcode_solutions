class Solution {
    public String orderlyQueue(String s, int k) {
        StringBuilder sb=new StringBuilder();
        char ans[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            ans[i]=s.charAt(i);
        }
        
        if(k>1){
            Arrays.sort(ans);
            String key=new String(ans);
           
            return key;
        }
        char arr[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
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