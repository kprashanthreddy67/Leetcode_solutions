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
        List<Integer> ans=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            ans.add(temp.val);
            temp=temp.next;
        }
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        int max=Integer.MIN_VALUE;
        for(int i=ans.size()-1;i>=0;i--){
            int val=ans.get(i);
            if(val>=max){
                max=val;
                curr.next=new ListNode(val);
                curr=curr.next;
            }
        }
        curr = check(dummy.next);
        return curr;
        // head=check(head);
        // ListNode dummy=new ListNode(-1);
        // ListNode curr=dummy;
        // ListNode temp=head;
        // // curr.next=temp;
        // int max=Integer.MIN_VALUE;
        // while(temp!=null){
        //     if(temp.val>=max){
        //         max=temp.val;
        //         curr.next=temp;
        //         curr=curr.next;
        //         // temp=temp.next;
        //     }
        //     temp=temp.next;
        // }
        // curr.next=null;
        // head=check(dummy.next);
        // return head;
    }
}