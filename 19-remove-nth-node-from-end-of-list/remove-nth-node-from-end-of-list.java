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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       List<Integer> a = new ArrayList<>();
       while(head!=null){
        a.add(head.val);
        head=head.next;
       } 
       a.remove(a.size()-n);
       if(a.size()==0){
        return null;
       }
       ListNode k = new ListNode(a.get(0));
       ListNode r = k;
       for(int i=1;i<a.size();i++){
            r.next=new ListNode(a.get(i));
            r=r.next;
       }
       return k;
    }
}