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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> a = new ArrayList<>();
        for(ListNode head :lists){
            ListNode curr = head;
            while(curr!=null){
                a.add(curr.val);
                curr=curr.next;
            }
        }
        Collections.sort(a);
        if(a.size()==0){
            return null;
        }
        ListNode k = new ListNode(a.get(0));
        ListNode curr = k;
        for(int i=1;i<a.size();i++){
            curr.next=new ListNode(a.get(i));
            curr = curr.next;
        }
        return k;
    }
}