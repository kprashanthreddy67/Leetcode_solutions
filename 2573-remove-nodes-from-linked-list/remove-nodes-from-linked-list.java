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
    public ListNode check(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        head=check(head);
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        ListNode temp=head;
        // curr.next=temp;
        int max=Integer.MIN_VALUE;
        while(temp!=null){
            if(temp.val>=max){
                max=temp.val;
                curr.next=temp;
                curr=curr.next;
                // temp=temp.next;
            }
            temp=temp.next;
        }
        curr.next=null;
        head=check(dummy.next);
        return head;
    }
}