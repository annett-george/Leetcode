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
        ListNode temp=head;
        ListNode temp1= head;
        while(temp1!=null && temp1.next!=null){
            temp=temp.next;
            temp1=temp1.next.next;
        }
        temp1=null;
        while(temp!=null){
            ListNode next = temp.next;
            temp.next=temp1;
            temp1=temp;
            temp=next;
        }
        temp=head;
        int max = Integer.MIN_VALUE;
        while(temp1!=null){
            max=Math.max(max,temp1.val+temp.val);
            temp=temp.next;
            temp1=temp1.next;
        }
        return max;
    }
}