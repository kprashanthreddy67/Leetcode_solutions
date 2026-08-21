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
    public int pairSum(ListNode head) {
        int ans=0;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=slow.next;
        slow.next=null;
        ListNode prev=null;
        while(second!=null){
            ListNode next=second.next;
            second.next=prev;
            prev=second;
            second=next;
        }
        ListNode first=head;
        ListNode sec=prev;
        int max=0;
        while(sec!=null){
            
            max=Math.max(max,first.val+sec.val);
            first=first.next;
            sec=sec.next;
        }
        return max;
    }
}