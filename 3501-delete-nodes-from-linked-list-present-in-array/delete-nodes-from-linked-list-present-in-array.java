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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> a = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        ListNode k = new ListNode();
        ListNode t = k;
        while(head!=null){
        if(!a.contains(head.val)){
            t.next=new ListNode(head.val);
            t=t.next;
           
        }
        head=head.next;
        }
        return k.next;
    }
}