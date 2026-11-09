class Solution {
    public int compress(char[] chars) {
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
                String temp=String.valueOf(cnt);
                for(int j=0;j<temp.length();j++){
                    chars[index]=temp.charAt(j);
                    index++;
                }
            }
        }
        return index;
    }
}