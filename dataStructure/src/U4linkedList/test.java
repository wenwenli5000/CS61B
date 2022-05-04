package U4linkedList;

public class test {

    //两个单链表相交的一系列问题
    //给定两个可能有环也可能无环的单链表，头节点head1和head2。请实现一个函数，如果两个链表相交，返回相交的第一个节点，如果不相交返回nul
    //如果两个链表长度之和为N,时间复杂度O(N),额外空间复杂度O(1)
    public class Node {
        private int value;
        public Node next;
        public Node (int data) {
            this.value = data;
        }
    }

    public static Node getIn(){

    }

  // 找到链表的第一个入环节点，如果无环，返回空
    public static Node getLoopNode(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
            return null;
        }
        Node n1 = head.next; //n1->slow
        Node n2 = head.next.next; //n2 -> fast
        while (n1 != n2) {
            if (n2.next.next == null || n2.next= null) {
                return null;
            }
            n2 = n2.next.next;
            n1 = n1.next;

        }
        n2 = head; // n2->walk again from head
        while (n1 != n2) {
            n1 = n1.next;
            n2 = n2.next;
        }
        return n1;
    }

    //无环的两个单链表，最后一定是Y型相交，有公共部分，长的先走差值步，再一起走，一定在第一个节点相遇
    public static Node noloop(Node head1, Node head2) {
        if (head1== null || head2== null) {
            return null;
        }
        Node cur1= head1;
        Node cur2=head2;
        int n=0;
        while (cur1.next != null) {
            n++;
            cur1=cur1.next;
        }
        while (cur2.next !=null) {
            n--;
            cur2= cur2.next;
        }
        cur1=n>0?head1:head2;
        cur2=cur1==head1?head2:head1;

    }

}


