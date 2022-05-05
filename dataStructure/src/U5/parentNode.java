package U5;
//在二叉树中找到一个节点的后继节点
public class parentNode {
    public class Node {
        public int value;
        public Node left;
        public Node right;
        public Node parent;
        public Node (int val) {
            value =val;
        }
    }

    public static Node getSuccessorNode (Node node) {
        if (node == null) {
            return node;
        }
        if (node.right != null) {
            return getleftmost (node.right);// 如果有右子树，后继节点就是右节点最左边的树
        }else { //  无右子树
            Node parent = node.parent;
            while (parent != null && parent.left != node) {// 当前节点是其父亲节点右孩子
                node =parent;
                parent =node.parent;
            }
            return parent;
        }
    }
    public static Node getleftmost (Node node) {
        if (node == null) {
            return node;
        }
        while (node.left != null) {
            node =node.left;
        }
        return node;
    }
}
