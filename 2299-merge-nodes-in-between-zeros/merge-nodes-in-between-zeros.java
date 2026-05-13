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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head;
        ListNode temp_head = new ListNode();
        ListNode temp=temp_head;
        while(curr!=null){
            curr=curr.next;
            int sum=0;
            while(curr!=null && curr.val!=0){
                sum+=curr.val;
                curr=curr.next;
            } 
            if(sum>0){
                temp.next = new ListNode(sum);
                temp=temp.next;
            }
            
        }
        return temp_head.next;
    }
}