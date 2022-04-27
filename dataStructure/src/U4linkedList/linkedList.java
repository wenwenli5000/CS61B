package U4linkedList;

import java.util.Stack;

public class linkedList {
    //  判断一个singleLinkedList是不是回文结构
    //  栈：先进后出
    // 快慢指针：快指针一次走2步，慢指针一次走1步，当快指针走完，慢指针来到了中点的位置。需要code定制，需要写熟练
    public static class Node {
        public int value;
        public Node next;

        public Node( int data) {
            this.value=data;
        }
    }
    //need n extra space 栈
    public static boolean isPalindrome1(Node head) {
        Stack<Node> stack =new Stack<Node>();
        Node cur =head;
        while (cur != null) {
            stack.push(cur);
            cur=cur.next;
        }
        while (head != null) {
            if (head.value != stack.pop().value) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
    // need n/2 extra space 快慢指针
    public static boolean isPalindrome2 (Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node right= head.next;
        Node cur =head;
        while (cur.next!= null && cur.next.next != null) {
            right=right.next;
            cur=cur.next.next;
        }
        Stack< Node> stack =new Stack<>();
        while (right != null) {
            stack.push(right);
            right=right.next;
        }
        while (!stack.isEmpty()){
            if (head.value != stack.pop().value) {
                return false;
            }
            head=head.next;
        }

        return true;
    }

    // need O(1) extra space
    public static boolean isPalindrome3 (Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node n1=head;
        Node n2= head;
        while (n2.next != null && n2.next.next != null) {
            n1= n1.next;//n1-> mid
            n2=n2.next.next;// n2->end

        }
        n2 = n1.next; //n2-> right part first node
        n1.next=null; // mid.next -> null
        Node n3= null;
        while (n2 != null) { //right part convert
            n3=n2.next; //n3-> save next node
            n2.next=n1; // nest of right node convert
            n1=n2;// n1 move
            n2=n3;// n2 move
        }
        n3=n1; // n3 -> save last node
        n2=head; // n2 ->left first node
        boolean res = true;
        while (n1 != null && n2 != null) { // check palindrome
            if (n1.value != n2.value) {
                res =false;
            }
        }
        return true;

    }


}
