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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();
        while(l1!=null){
            a1.add(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            a2.add(l2.val);
            l2=l2.next;
        }
        int c=0;
        int max= Math.max(a1.size(),a2.size());
        List<Integer> r = new ArrayList<>();
        for(int i=0;i<max;i++){
           int n1 = (i<a1.size())?a1.get(i):0;
           int n2 = (i<a2.size())?a2.get(i):0;
           int s  = n1+n2+c;
           r.add(s%10);
           c=s/10;
        }
        if(c>0) {
           r.add(c);
        }
        ListNode res = new ListNode(r.get(0));
        ListNode t = res;
        for(int i=1;i<r.size();i++){
            t.next=new ListNode(r.get(i));
            t=t.next;
        }
        return res;
    }
}