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
    public ListNode rotateRight(ListNode head, int k) {
        ArrayList<Integer> a = new ArrayList<>();
        while(head!=null){
            a.add(head.val);
            head=head.next;
        }
        if(a.size()==0){
            return null;
        }
        Collections.rotate(a,k);
        ListNode n = new ListNode(a.get(0));
        ListNode curr = n;
        for(int i=1;i<a.size();i++){
            curr.next=new ListNode(a.get(i));
            curr=curr.next;
        }
        return n;
    }
}