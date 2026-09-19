/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        List<Integer> ans=new ArrayList<>();
        while(temp!=null){
            ans.add(temp.val);
            temp=temp.next;
        }
        Stack<Integer> st=new Stack();
        int res[]=new int[ans.size()];
        for(int i=ans.size()-1;i>=0;i--){
            int val=ans.get(i);
            while(!st.isEmpty() && st.peek()<=val){
                st.pop();
            }
            res[i]=(st.isEmpty())?0:st.peek();
            st.push(val);
        }
        return res;
    }
}