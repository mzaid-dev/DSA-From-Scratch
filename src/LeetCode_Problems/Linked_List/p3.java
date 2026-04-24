package LeetCode_Problems.Linked_List;

import LeetCode_Problems.Linked_List.Circular_Doubly_Linked_List.ListNode;

//https://leetcode.com/problems/palindrome-linked-list/

public class p3 {

    public static ListNode reverseSll(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }


    public static ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){

            fast = fast.next.next;
            slow = slow.next;

        }

        return slow;
    }


    public static int len(ListNode head){

        int len = 0;

        ListNode temp = head;

        while (temp != null){
            len ++;

            temp = temp.next;
        }

        return len;
    }




    public static void displaySll(ListNode head){
        if (head == null) {
            System.out.println("null");
            return;
        }

        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }


    public static boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null){
            return  true;
        }

        ListNode firstHalf = head;
        ListNode secondHalf = middle(head);

        secondHalf = reverseSll(secondHalf);


        while (secondHalf != null){
            if (firstHalf.val != secondHalf.val){
                return false;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;

    }

    public static void main(String[] args) {
        ListNode<Integer> first = new ListNode<>(1);
        ListNode<Integer> second = new ListNode<>(1);
        ListNode<Integer> third = new ListNode<>(2);
        ListNode<Integer> fourth = new ListNode<>(1);
        ListNode<Integer> five = new ListNode<>(1);


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


        System.out.println(isPalindrome(first));



    }
}
