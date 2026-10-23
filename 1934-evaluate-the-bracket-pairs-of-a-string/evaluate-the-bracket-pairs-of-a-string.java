class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> hm=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(List<String> pair:knowledge){
            hm.put(pair.get(0),pair.get(1));
        }
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                sb.append(ch);
            }else if(ch=='('){
                i++;
                String curr="";
                while(i<s.length() && s.charAt(i)!=')'){
                    curr+=s.charAt(i);
                    i++;
                }
                if(hm.containsKey(curr)){
                    sb.append(hm.get(curr));
                }else{
                    sb.append("?");
                }
            }
            i++;
        }
        return sb.toString();
    }
}