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
        ListNode first = head;
        ListNode second = reverse(middleNode(head).next);
        ListNode dup = second;
        boolean res=true;
        while(second!=null){
            if(first.val!=second.val){
                res=false;
                break;
            }
            first=first.next;
            second=second.next;
        }
        reverse(dup);
        return res;
    }
    public ListNode middleNode(ListNode head){
        ListNode slow=head, fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode current=head;
        ListNode prev=null;
        while(current!=null){
            ListNode next = current.next;
            current.next = prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}