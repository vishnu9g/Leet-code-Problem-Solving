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
    public int pairSum(ListNode head) {
        List<Integer> a = new ArrayList<>();
        while(head!=null){
            a.add(head.val);
            head=head.next;
        }
        int a1 = 0;
        int b = a.size()-1;
        int max = 0;
        while(a1<b){
            int sum = a.get(a1)+a.get(b);
            max=Math.max(max,sum);
            a1++;
            b--;
        }
         return max;
    }
}