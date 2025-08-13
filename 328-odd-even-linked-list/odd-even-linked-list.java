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
    public ListNode oddEvenList(ListNode head) {
        List<Integer> a = new ArrayList<>();
        while(head!=null){
            a.add(head.val);
            head=head.next;
        }
        if(a.size()==0){
            return null;
        }
        ListNode r = new ListNode(a.get(0));
        ListNode t = r;
        for(int i=2;i<a.size();i=i+2){
            t.next=new ListNode(a.get(i));
            t=t.next;
        }
         for(int i=1;i<a.size();i=i+2){
            t.next=new ListNode(a.get(i));
            t=t.next;
        }
        return r;
    }
}