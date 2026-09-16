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
    public boolean isPalindrome(ListNode head) {
        // if(head==null || head.next==null){
        //     return true;
        // }
        ListNode slow=head;
        ListNode fast=head;
        // ListNode prev=null;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        ListNode sec=slow;
        // slow.next=null;
        ListNode prev=null;
        while(sec!=null){
            ListNode next=sec.next;
            sec.next=prev;
            prev=sec;
            sec=next;

        }
        ListNode first=head;
        ListNode se=prev;
        while(se!=null){
            // ListNode firstn=first.next;
            // ListNode sen=se.next;
            if(first.val!=se.val){
                return false;
            }
            first=first.next;
            se=se.next;
            
        }
        return true;
    }
}