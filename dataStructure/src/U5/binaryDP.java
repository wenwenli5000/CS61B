package U5;

public class binaryDP {
    //树型DP ：是否是满二叉树？

    public class Node {
        public int value;
        public Node left;
        public Node right;
    }
    public static boolean isF (Node head) {
        if (head == null) {
            return true;
        }
        Info data =process(head);
        return data.nodes ==( 1<< data.nodes-1);
    }

    public static class Info {
        public int height;
        public int nodes;

        public Info(int h,int n) {
            height=h;
            nodes=n;
        }
    }
    public static Info process (Node x) {
        if (x == null) {
            return new Info(0,0);
        }
        Info leftData = process (x.left);
        Info rightData = process (x.right);
        int height =Math.max(leftData.height,rightData.height)+1;
        int nodes= Math.max(leftData.nodes, rightData.nodes)+1;
        return new Info(height,nodes);
    }

}
