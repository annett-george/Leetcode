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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr = head;
        ListNode next = head.next;
        while(prev.next!=null && prev.next.next!=null){
            ListNode one= prev.next;
            ListNode two = prev.next.next;
            one.next=two.next;
            two.next=one;
            prev.next=two;
            prev=one;
        }
        return dummy.next;
    }
}