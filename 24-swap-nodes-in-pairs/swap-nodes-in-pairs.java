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
    public ListNode swapPairs(ListNode head) {
        ArrayList<Integer> a = new ArrayList<>();
        while(head!=null){
            a.add(head.val);
            head=head.next;
        }
        if(a.size()==0){
            return null;
        }
        for(int i=0;i<a.size()-1;i=i+2){
            Collections.swap(a,i,i+1);
        }
        ListNode r = new ListNode(a.get(0));
        ListNode c = r;
        for(int i=1;i<a.size();i++){
            c.next=new ListNode(a.get(i));
            c=c.next;
        }
        return r;
    }
}