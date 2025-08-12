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
    public ListNode deleteDuplicates(ListNode head) {
        LinkedHashSet<Integer> n = new LinkedHashSet<>();
        while(head!=null){
            n.add(head.val);
            head=head.next;
        }
        if(n.isEmpty()) return null;
        Iterator<Integer> k = n.iterator();
        ListNode a = new ListNode(k.next());
        ListNode t = a;
        while (k.hasNext()) {
            t.next = new ListNode(k.next());
            t = t.next;
        } 
        return a;
    }
}