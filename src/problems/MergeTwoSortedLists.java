package problems;

import common.ListNode;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(7);
        l1.next.next.next = new ListNode(8);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(3);
        l2.next.next.next = new ListNode(5);
        ListNode res = new MergeTwoSortedLists().mergeTwoLists(l1, l2);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1), t = dummy;
        while (l1 != null && l2 != null)
            if (l1.val <= l2.val) {
                t.next = l1;
                t = l1;
                l1 = l1.next;
            } else {
                t.next = l2;
                t = l2;
                l2 = l2.next;
            }
        if (l1 != null) t.next = l1;
        if (l2 != null) t.next = l2;
        return dummy.next;
    }
}
