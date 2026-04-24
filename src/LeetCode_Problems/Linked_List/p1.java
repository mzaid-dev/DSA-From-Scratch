package LeetCode_Problems.Linked_List;

// https://leetcode.com/problems/linked-list-cycle/description/

// Algorithm used
// Floyd’s Cycle-Finding Algorithm (The Tortoise and the Hare)

import LeetCode_Problems.Linked_List.Circular_Doubly_Linked_List.ListNode;

public class p1 {

    public static boolean hasCycle(ListNode head) {

        if (head == null || head.next == null)
            return  false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;

    }
    public static void main(String[] args) {
        ListNode<Integer> first = new ListNode<>(3);
        ListNode<Integer> second = new ListNode<>(2);
        ListNode<Integer> third = new ListNode<>(0);
        ListNode<Integer> fourth = new ListNode<>(-4);


        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;


        ListNode<Integer> head = first;

        System.out.println(hasCycle(head));

    }

}
