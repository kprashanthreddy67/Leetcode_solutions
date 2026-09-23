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
    public ListNode modifiedList(int[] nums, ListNode head) {
        List<Integer> ans=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            ans.add(temp.val);
            temp=temp.next;
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);

        }
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        for(int i=0;i<ans.size();i++){
            if(!hs.contains(ans.get(i))){
                curr.next=new ListNode(ans.get(i));
                curr=curr.next;
            }
        }
        return dummy.next;
    }
}