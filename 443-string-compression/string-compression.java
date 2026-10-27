class Solution {
    public int compress(char[] chars) {
        int index=0;
        // String curr="";
        int i=0;
        while(i<chars.length){
            char curr=chars[i];
            int cnt=0;
            while(i<chars.length && chars[i]==curr){
                cnt++;
                i++;
            }
            chars[index]=curr;
            index++;
            if(cnt>1){
                String val=String.valueOf(cnt);
                for(int j=0;j<val.length();j++){
                    chars[index]=val.charAt(j);
                    index++;
                }
            }
        }
        return index;
    }
}