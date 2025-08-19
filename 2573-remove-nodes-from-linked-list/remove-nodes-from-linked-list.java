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
    public ListNode removeNodes(ListNode head) {
        List<Integer> a = new ArrayList<>();
        while (head != null) {
            a.add(head.val);
            head = head.next;
        }
        List<Integer> t = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = a.size() - 1; i >= 0; i--) {
            if (a.get(i) >= max) {
                t.add(a.get(i));
                max = a.get(i);
            }
        }
        ListNode k = new ListNode();
        ListNode q = k;
        for (int i = t.size() - 1; i >= 0; i--) {
            q.next = new ListNode(t.get(i));
            q = q.next;
        }

        return k.next;
    }
}
