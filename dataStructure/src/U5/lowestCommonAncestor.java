package U5;

import java.util.HashMap;
import java.util.HashSet;

//给定两个二叉树的节点node1 和 node2， 找到他们的最低公共祖先节点
public class lowestCommonAncestor {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node (int data) {
            this.value=data;
        }
    }
    public static Node lca (Node head,Node o1,Node o2) {
        HashMap <Node, Node> fatherMap =new HashMap<>();
        fatherMap.put(head,head);
        process(head,fatherMap);
        HashSet<Node> set1 =new HashSet<>();

        Node cur= o1;
        while (cur != fatherMap.get(cur)) {
            set1.add(cur);
            cur =fatherMap.get(cur);
        }
        set1.add(head);
        while (o2 == set1.add(cur))


    }

    public static Node process (Node head ,HashMap <Node, Node> fatherMap ){
        if (head ==null) {
            return;
        }
        fatherMap.put(head.left,head);
        fatherMap.put(head,head);
        process(head.left,fatherMap);
        process(head.right,fatherMap)


    }


    //优化
    public static Node lowestCommonAncestor (Node head,Node o1,Node o2){
        if(head ==null || head==o1 || head ==o2 ) {
            return head;
        }
        Node left= lowestCommonAncestor(head.left, o1, o2);
        Node right =lowestCommonAncestor(head.right, o1, o2);
        if (left != null && right != null) {
            return head;
        }
        // 左右两棵树，并不都有返回值
        return left != null ? left :right;

    }


}
