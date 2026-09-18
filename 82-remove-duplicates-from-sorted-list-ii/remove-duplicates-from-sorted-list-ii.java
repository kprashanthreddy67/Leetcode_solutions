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
    public ListNode deleteDuplicates(ListNode head) {
        TreeMap<Integer,Integer> hm=new TreeMap<>();
        ListNode temp=head;
        while(temp!=null){
            hm.put(temp.val,hm.getOrDefault(temp.val,0)+1);
            temp=temp.next;
        }
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        for(int boom:hm.keySet()){
            if(hm.get(boom)==1){
                curr.next=new ListNode(boom);
                curr=curr.next;
            }
        }
        return dummy.next;
    }
}