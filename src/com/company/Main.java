package com.company;


import java.util.ArrayList;
import java.util.List;

import static com.company.ListNode.deleteDuplicates;


public class Main {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode second = new ListNode(1);
        head.next = second;
        ListNode third = new ListNode(2);
        second.next = third;
        ListNode forth = new ListNode(2);
        third.next = forth;
        ListNode fifth = new ListNode(2);
        forth.next = fifth;
        ListNode six = new ListNode(3);
        fifth.next = six;
        ListNode seven = new ListNode(3);
        six.next = seven;
        List list = new ArrayList();
        ListNode tmp = head;
        while (tmp != null) {
            list.add(tmp);
            tmp = tmp.next;
        }
        System.out.println(list);
        deleteDuplicates(head);
        list.clear();
        ListNode tmp1 = head;
        while (tmp1 != null) {
            list.add(tmp1);
            tmp1 = tmp1.next;
        }
        System.out.println(list);
    }


}
