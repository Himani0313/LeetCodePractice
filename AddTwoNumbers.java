/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if((l1 == null) && (l2 == null)){
            return null;
        }
        ListNode extra = new ListNode(0);
        ListNode head = extra;
        int carry = 0;
        int sum = 0;
        
        while((l1 != null) && (l2 != null)){
            sum = l1.val +l2.val + carry;
            carry = sum / 10;
            head.next = new ListNode(sum % 10);
            l1 = l1.next;
            l2 = l2.next;
            head = head.next;
        }
        
       while (l1 != null) {
			sum = l1.val + carry;
			carry = sum / 10;
			head.next = new ListNode(sum % 10);
			l1 = l1.next;
			head = head.next;
		}

		while (l2 != null) {
			sum = l2.val + carry;
			carry = sum / 10;
			head.next = new ListNode(sum % 10);
			l2 = l2.next;
			head = head.next;
		}
		
		if (carry != 0) {
			head.next = new ListNode(carry);
		}
        
        return extra.next;
        
    }
}