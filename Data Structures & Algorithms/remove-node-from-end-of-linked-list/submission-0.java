class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Step 1: Reverse list
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        // prev is new head of reversed list
        ListNode revHead = prev;

        // Step 2: Remove nth node from start
        if (n == 1) {
            revHead = revHead.next;
        } else {
            ListNode temp = revHead;
            for (int i = 1; i < n - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        // Step 3: Reverse again to restore order
        curr = revHead;
        prev = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}