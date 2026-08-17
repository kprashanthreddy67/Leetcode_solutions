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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode check(ListNode head){
        if(head==null){
            return null;
        }
        ListNode prev=null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;

        }
        if(head.next==null){
            return new TreeNode(head.val);
        }
        prev.next=null;
        ListNode second=slow.next;
        slow.next=null;
        // if(head.next==null){
        //     return new TreeNode(head.val);

        // }
        TreeNode root=new TreeNode(slow.val);
        root.left=check(head);
        root.right=check(second);
        return root;

    }
    public TreeNode sortedListToBST(ListNode head) {
        

        return check(head);
    }
}