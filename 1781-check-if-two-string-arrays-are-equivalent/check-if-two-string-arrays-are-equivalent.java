class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder  sb=new StringBuilder();
         StringBuilder  sb1=new StringBuilder();
         for(String ch:word1){
            sb.append(ch);
         }
        for(String ch:word2){
            sb1.append(ch);
        }
         if(sb.toString().equals(sb1.toString())){
            return true;
         }
         return false;

    }
}