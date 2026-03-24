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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;
        while(temp != null && count < k){
            count++;
            temp = temp.next;
        }
        if(count < k){
            return head;
        }
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;
        int i = 0;
        while(curr != null && i < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }
        if(next != null){
            head.next = reverseKGroup(next, k);
        }
        return prev;
    }
}