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
        List<Integer> a = new ArrayList<>();
        while(head!=null){
            a.add(head.val);
            head=head.next;
        }
        LinkedHashMap<Integer,Integer> m = new LinkedHashMap<>();
        for(int i:a){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        ListNode k = new ListNode();
        ListNode t = k;
        for(Map.Entry<Integer,Integer> b : m.entrySet()){
            if(b.getValue()==1){
                t.next=new ListNode(b.getKey());
                t=t.next;
            }
        }
        return k.next;
    }
}