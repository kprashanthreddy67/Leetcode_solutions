class Solution {
    public int compress(char[] chars) {
        int i=0;
        int index=0;
        while(i<chars.length){
            char curr=chars[i];
            int cnt=0;
            while(i<chars.length && chars[i]==curr){
                i++;
                cnt++;
            }
            chars[index]=curr;
            index++;
            if(cnt>1){
                String curr_ind=String.valueOf(cnt);
                for(int j=0;j<curr_ind.length();j++){
                    chars[index]=curr_ind.charAt(j);
                    index++;

                }
            }
        }
       return index;
    }
}