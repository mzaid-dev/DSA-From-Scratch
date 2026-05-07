package LeetCode_Problems.Linked_List;

//https://leetcode.com/problems/odd-even-linked-list/

import LeetCode_Problems.Linked_List.Linked_List_Implementation.ListNode;

public class p6 {
    public static void displayLL(ListNode head){

        ListNode temp = head;
        while (temp != null){
            System.out.print(temp);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
//       Test Case
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode five = new ListNode(5);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = five;

        displayLL(first);

        displayLL(oddEvenList(first));

    }
}
