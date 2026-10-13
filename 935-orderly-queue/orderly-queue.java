class Solution {
    public String orderlyQueue(String s, int k) {
        StringBuilder sb=new StringBuilder();
        List<Character> ans=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            ans.add(ch);
        }
        if(k>1){
            Collections.sort(ans);
            for(int i=0;i<ans.size();i++){
                sb.append(ans.get(i));
            }
            return sb.toString();
        }
        char arr[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
      if(k==1){
        String res=s;
        for(int i=0;i<s.length()-1;i++){
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