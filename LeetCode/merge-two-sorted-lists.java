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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        ListNode ret = new ListNode();
        ListNode tmp = ret;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                tmp.val = l2.val;
                tmp.next = l2.next;
                break;
            } else if (l2 == null) {
                tmp.val = l1.val;
                tmp.next = l1.next;
                break;
            }
            if (l1.val >= l2.val) {
                tmp.val = l2.val;
                tmp.next = new ListNode(9);
                tmp = tmp.next;
                l2 = l2.next;
            } else {
                tmp.val = l1.val;
                tmp.next = new ListNode(9);
                tmp = tmp.next;
                l1 = l1.next;
            }
        }
        
        return ret;
    }
}