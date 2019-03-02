package com.company;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {

        return "{"  + val +
                '}';
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = head;
        while (node != null) {
            ListNode tmp = node.next;
            ListNode previous = node;
            while (tmp != null) {
                if (node.val == tmp.val) {
                    ListNode next = tmp.next;
                    previous.next = next;
                    tmp = tmp.next;
                } else {
                    tmp = tmp.next;
                    previous = previous.next;
                }
            }
            node = node.next;
        }
        return head;
    }

}
