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
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        for(int i=0;i<ans.size();i++){
            int val=ans.get(i);
            if(!hs.contains(val)){
                curr.next=new ListNode(val);
                curr=curr.next;
            }
        }

        return dummy.next;
    }
}