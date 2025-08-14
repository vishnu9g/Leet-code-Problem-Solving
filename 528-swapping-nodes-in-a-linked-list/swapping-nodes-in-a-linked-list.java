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
    public ListNode swapNodes(ListNode head, int k) {
        List<Integer> a = new ArrayList<>();
        while(head!=null){
            a.add(head.val);
            head=head.next;
        }
        if(a.size()==0) return null;
        Collections.swap(a,k-1,a.size()-k);
        ListNode k1 = new ListNode();
        ListNode t = k1;
        for(int i=0;i<a.size();i++){
            t.next=new ListNode(a.get(i));
            t=t.next;
        }
        return k1.next;
    }
}