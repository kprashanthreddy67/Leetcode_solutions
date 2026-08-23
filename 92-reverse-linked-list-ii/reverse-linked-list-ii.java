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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int cnt=1;
        ListNode temp=head;
        ListNode last=null;
        while(temp!=null && cnt!=left){
            cnt++;
            last=temp;
            temp=temp.next;
        }
        ListNode sec=temp;

        ListNode prev=null;
        for(int i=1;i<=(right-left+1);i++){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        if(last!=null){
           last.next=prev;
        }else{
             head=prev;
        }
        sec.next=temp;
        return head;
    

    }
}