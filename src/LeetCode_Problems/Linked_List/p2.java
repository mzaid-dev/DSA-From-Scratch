package LeetCode_Problems.Linked_List;


//https://leetcode.com/problems/remove-nth-node-from-end-of-list/

import LeetCode_Problems.Linked_List.Circular_Doubly_Linked_List.ListNode;

// use slow and fast
public class p2 {

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummmy = new ListNode<>(null);
        dummmy.next = head;

        ListNode slow = dummmy;
        ListNode fast = dummmy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null ){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummmy.next;
    }

    public static void main(String[] args) {
        ListNode<Integer> first = new ListNode<>(1);
        ListNode<Integer> second = new ListNode<>(2);
        ListNode<Integer> third = new ListNode<>(3);
        ListNode<Integer> fourth = new ListNode<>(4);
        ListNode<Integer> five = new ListNode<>(5);


        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = five;

//      test sll is working correctly
//        ListNode<Integer> temp = first;
//        while (temp != null){
//            System.out.println(temp);
//
//            temp = temp.next;
//        }

        System.out.println(removeNthFromEnd(first,2));




    }


}
