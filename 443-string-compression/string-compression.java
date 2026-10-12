class Solution {
    public int compress(char[] chars) {
        int l=0;
        int r=0;
        int index=0;
        
        int i=0;
        while(i<chars.length){
            char curr=chars[i];
            int cnt=0;
            while(i<chars.length && curr==chars[i]){
                i++;
                cnt++;
            }
            chars[index]=curr;
            index++;
            if(cnt>1){  
              String curr_index=String.valueOf(cnt);
              for(int j=0;j<curr_index.length();j++){
                chars[index]=curr_index.charAt(j);
                index++;
              }
            }
        }
        return index;
    }
}