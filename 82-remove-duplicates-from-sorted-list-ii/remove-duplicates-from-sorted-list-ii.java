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
        ListNode temp=head;
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        while(temp!=null && temp.next!=null){
            if(temp.val!=temp.next.val){
                curr.next=temp;
                curr=curr.next;
                temp=temp.next;
            }else{
                while(temp.next!=null && temp.val==temp.next.val){
                    temp=temp.next;
                }
                temp=temp.next;
            }
        }
        curr.next=temp;
        return dummy.next;
    }
}