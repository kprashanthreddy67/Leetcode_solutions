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
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
        // List<Integer>ans=new ArrayList<>();
        // ListNode temp=head;
        // while(temp!=null){str
        //     ans.add(temp.val);
        //     temp=temp.next;
        // }
        // Collections.reverse(ans);
        // ListNode dummy=new ListNode(-1);
        // ListNode curr=dummy;
        // for(int num:ans){
        //     curr.next=new ListNode(num);
        //     curr=curr.next;
        // }
        // return dummy.next;
        //optimal
        // ListNode temp=head;
        // ListNode prev=null;
        // while(temp!=null){
        //     ListNode next=temp.next;
        //     temp.next=prev;
        //     prev=temp;
        //     temp=next;
        // }
        // return prev;
    }
}