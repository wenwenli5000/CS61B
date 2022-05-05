package U5;

import java.util.LinkedList;
import java.util.Queue;
//二叉树序列化与反序列化
public class leetcode297 {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    public static String serialByPre(Node head) {
        if (head == null) {
            return "#_";
        }
        String res = head.value + "_";
        res += serialByPre(head.left);
        res += serialByPre(head.right);
        return res;
    }

    public static Node reconByPreString(String preStr) {
        String[] values = preStr.split("_");
        Queue<String> queue = new LinkedList<String>();
        for (int i = 0; i != values.length; i++) {
            queue.add(values[i]);
        }
        return reconByPreOrder(queue);

    }

    public static Node reconByPreOrder(Queue<String> queue){

    }

}
