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
        ListNode curr=head.next;
        int sum=0;
        while (curr.val!=0) {
            sum+=curr.val;
            curr=curr.next;
        }
        ListNode k=new ListNode(sum);
        ListNode t=k;
        sum=0;
        curr=curr.next;
        while (curr!=null) {
            if (curr.val==0) {
                t.next=new ListNode(sum);
                t=t.next;
                sum = 0;
            } else {
                sum+=curr.val;
            }
            curr=curr.next;
        }
        return k;
    }
}
