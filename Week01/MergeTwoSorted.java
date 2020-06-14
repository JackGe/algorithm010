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
class MergeTowSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode();
        ListNode pNode = newHead;


        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                pNode.next = l1;
                l1 = l1.next;
            }else{
                pNode.next = l2;
                l2 = l2.next;
            }
             pNode = pNode.next;


        }
        if(pNode == null){
            return l1 !=null ? l1 :l2;
        }
        if (l1 != null ) {
            pNode.next = l1;
        }
        if (l2 != null) {
            pNode.next = l2;
        }
        return newHead.next;

    }
}
