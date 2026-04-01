class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;

        ListNode odd = head;           // 1st node
        ListNode even = head.next;     // 2nd node
        ListNode evenHead = even;      // save even head

        while(even != null && even.next != null) {
            odd.next = even.next;     // link odd nodes
            odd = odd.next;

            even.next = odd.next;     // link even nodes
            even = even.next;
        }

        odd.next = evenHead;          // attach even list at end
        return head;
    }
}