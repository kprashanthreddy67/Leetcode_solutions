class Solution {
    public int compress(char[] chars) {
        int i=0;
        int index=0;
        while(i<chars.length){
            int cnt=0;
            char curr=chars[i];
            while(i<chars.length && curr==chars[i]){
                i++;
                cnt++;
            }
            chars[index]=curr;
            index++;
            if(cnt>1){
                String value=String.valueOf(cnt);
                for(int j=0;j<value.length();j++){
                    chars[index]=value.charAt(j);
                    index++;
                }
            }
        }
        return index;
    }
}