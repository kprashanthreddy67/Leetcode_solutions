class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> ans=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            int val=asteroids[i];
            boolean isdamaged=false;
            while(!st.isEmpty() && st.peek()>0 && val<0){
                if(st.peek()<-val){
                    st.pop();
                }else if(st.peek()==-val){
                    st.pop();
                    isdamaged=true;
                    break;
                }else{
                    isdamaged=true;
                    break;
                }
            }
            if(!isdamaged){
                st.push(val);
            }
        }
        
        while(!st.isEmpty()){
            int val1=st.pop();
            ans.add(val1);

        }
        Collections.reverse(ans);
        int arr[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
        return arr;
    }
}