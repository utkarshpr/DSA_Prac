/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow =head;
        ListNode prev =null;
        while(fast!=null && slow !=null && fast.next!=null)
        {

            prev=fast;
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                while (head != slow) {
            head = head.next;
            slow = slow.next;
        }
        return head;
            }

        }
        return null;
    }
}