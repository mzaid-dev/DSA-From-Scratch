package LeetCode_Problems.Linked_List;


//https://leetcode.com/problems/intersection-of-two-linked-lists/description/

/* 1st way : two pointer with length alignment (Skip-and-Match Technique)
             Calculate Diff → Skip Extra Nodes → March Together Until Match.
*/

/* 2nd way : two pointer with head switch (A+B = B+A)
             Walk Both Lists → Switch Heads on Null → Meet at Intersection or Null.
*/

import LeetCode_Problems.Linked_List.Linked_List_Implementation.ListNode;


public class p4 {

    public static int len(ListNode head){

        int len = 0;

        ListNode temp = head;

        while (temp != null){
            len ++;

            temp = temp.next;
        }

        return len;
    }

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

    public static ListNode skipNodes(ListNode head,int n){
        ListNode newNode = head;
        for (int i = 0; i < n; i++) {
            newNode = newNode.next;
        }
        return newNode;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode intersectVal = null;

        if (headA == null || headB == null){
            return intersectVal;
        }

        int headALen = len(headA);
        int headBLen = len(headB);

        int diff = Math.abs(headALen-headBLen);

        ListNode dummy1 = headA;
        ListNode dummy2 = headB;
        if (headALen > headBLen){
           dummy1 = skipNodes(headA,diff);
        }else if (headALen < headBLen){
            dummy2 = skipNodes(headB,diff);
        }

        while (dummy1 != null){
            if (dummy1 == dummy2){
                intersectVal = dummy1;
                break;
            }

            dummy1 = dummy1.next;
            dummy2 = dummy2.next;

        }

        return  intersectVal;
    }


    public static void main(String[] args) {
//       first sll
        ListNode A1 = new ListNode(4);
        ListNode A2 = new ListNode(1);

//      connect these nodes
        A1.next = A2;

//      second sll
        ListNode B1 = new ListNode(5);
        ListNode B2 = new ListNode(6);
        ListNode B3 = new ListNode(1);

//      connect these nodes
        B1.next = B2;
        B2.next = B3;

//      intersecting sll
        ListNode S1 = new ListNode(8);
        ListNode S2 = new ListNode(4);
        ListNode S3 = new ListNode(5);

//      connect these nodes
        S1.next = S2;
        S2.next = S3;

//      connect intersecting with both sll
        A2.next = S1;
        B3.next = S1;

//      test these nodes are connected successfully
//        displayLL(A1);
//        displayLL(B1);


        System.out.println(getIntersectionNode(A1,B1));
        

    }
}
