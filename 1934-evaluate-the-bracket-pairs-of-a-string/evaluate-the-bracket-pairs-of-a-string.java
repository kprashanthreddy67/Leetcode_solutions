class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> hm=new HashMap<>();
        for(List<String> pair:knowledge){
            hm.put(pair.get(0),pair.get(1));
        }

        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<s.length()){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                sb.append(s.charAt(i));
            }else if(s.charAt(i)=='('){
                i++;
                String temp="";
                while(s.charAt(i)!=')' && i<s.length()){
                    temp+=s.charAt(i);
                    i++;
                }
                if(hm.containsKey(temp)){
                    sb.append(hm.get(temp));
                }else{
                    sb.append("?");
                }

            }
            i++;
        }
        return sb.toString();
    }
}