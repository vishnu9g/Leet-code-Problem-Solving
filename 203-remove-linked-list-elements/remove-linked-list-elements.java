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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        ArrayList<Integer> a = new ArrayList<>();
        while(head!=null){
            if(head.val!=val){
            a.add(head.val);
            }
            head=head.next;
        }
        if (a.size()==0) {
        return null;
        }
        ListNode k = new ListNode(a.get(0));
        ListNode curr = k;
        for(int i=1;i<a.size();i++){
            if(a.get(i)!=val){
                curr.next=new ListNode(a.get(i));
                curr=curr.next;
            }
        }
        return k;
    }
}