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
import java.math.BigInteger;
class Solution{
public ListNode doubleIt(ListNode head){
    List<Integer>a=new ArrayList<>();
        while(head!=null){
        a.add(head.val);
        head=head.next;
    }
    StringBuilder sb=new StringBuilder();
        for(int i:a){
        sb.append(i);
        }
    BigInteger num = new BigInteger(sb.toString());
        if(num.equals(BigInteger.ZERO)){
            return new ListNode(0);
        }
    BigInteger k=num.multiply(BigInteger.valueOf(2));
        String s=k.toString();
        ListNode r=new ListNode();
        ListNode t=r;
        for(int i=0;i<s.length();i++){
        t.next=new ListNode(s.charAt(i)-'0');
        t=t.next;
        }
    return r.next;
    }
}
