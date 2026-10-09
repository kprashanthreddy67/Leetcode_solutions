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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        List<Integer> ans=new ArrayList<>();
        for(ListNode list : lists){
            ListNode temp=list;
            while(temp!=null){
                ans.add(temp.val);
                temp=temp.next;
            }
        }
        Collections.sort(ans);
        for(int i=0;i<ans.size();i++){
            curr.next=new ListNode(ans.get(i));
            curr=curr.next;
        }
        return dummy.next;
    }
}