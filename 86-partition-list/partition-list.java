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
    public ListNode partition(ListNode head, int x) {
        ListNode temp1 = new ListNode(0);
        ListNode temp2 = new ListNode(0);
        ListNode great = temp1;
        ListNode small = temp2;
        ListNode curr= head;
        while(curr!=null){
            if(curr.val>=x){
                great.next = curr;
                great=great.next;
            }
            else{
                small.next=curr;
                small=small.next;
            }
            curr=curr.next;
        }
        great.next=null;
        small.next = temp1.next;
        return temp2.next;
    }
}