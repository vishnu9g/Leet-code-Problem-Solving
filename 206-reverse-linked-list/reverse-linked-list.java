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
        ArrayList<Integer> a = new ArrayList<>();
        while(head!=null){
            a.add(head.val);
            head=head.next;
        }
        Collections.reverse(a);
        ListNode temp = new ListNode(0);
        ListNode res = temp;
        for(int i:a){
            res.next = new ListNode(i);
            res = res.next;
        }
        return temp.next;
    }
}