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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        // if(head.val==val){
        //     return head.next;

        // }
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val!=val){
                curr.next=temp;
                curr=curr.next;
                temp=temp.next;
            }else{
                temp=temp.next;
            }
        }
        curr.next=null;
        return dummy.next;
    }
}