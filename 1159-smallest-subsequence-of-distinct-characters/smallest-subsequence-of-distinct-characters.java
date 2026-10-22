class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> st=new Stack<>();
        HashSet<Character> hs=new HashSet<>();
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']--;
            if(hs.contains(ch)){
                continue;
            }
            while(!st.isEmpty() && ch<st.peek() && freq[st.peek()-'a']>0){
                hs.remove(st.pop());
            }
            hs.add(ch);
            st.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:st){
            sb.append(ch);
        }
        return sb.toString();
    }
    
}