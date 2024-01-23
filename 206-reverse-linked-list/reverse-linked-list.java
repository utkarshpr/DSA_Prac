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
        return helper(head);
    }
    public ListNode helper(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
       
        while(head !=null)
        {
          head=head.next;
          curr.next=prev;
          prev=curr;
          curr=head;   
        }
        return prev;
        }
}