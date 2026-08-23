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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode sec=slow.next;
        slow.next=null;
         ListNode prev=null;
         while(sec!=null){
            ListNode next=sec.next;
            sec.next=prev;
            prev=sec;
            sec=next;
         }
        
         ListNode first=head;
         ListNode second=prev;
         while(second!=null){
              ListNode f=first.next;
              ListNode s=second.next;
              first.next=second;
              second.next=f;
              first=f;
              second=s;
         }
    }
}