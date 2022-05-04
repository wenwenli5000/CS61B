package U5;

public class BST {
    public class Node {
        public int value;
        public Node left;
        public Node right;
        
        public Node (int data){
            this.value=data;
        }
    }
    public static boolean isBinaryTree (Node head) {
        return process(head).isBinaryTree;
    }
    public static class returnType {
        public boolean isBinaryTree;
        public int min;
        public int max;

        public returnType(boolean isB, int mi, int ma) {
            isBinaryTree=isB;
            min=mi;
            max=ma;
        }
    }

    public static returnType process (Node x) {
        if (x ==null) {
            return null;
        }
        returnType leftData = process(x.left);
        returnType rightData = process(x.right);

        int min=x.value;
        int max= x.value;
        if(leftData !=null) {
            min=Math.min(min,leftData.min);
            max=Math.max(max, leftData.max);
        }
        if(rightData != null) {
            min=Math.min(min, rightData.min);
            max=Math.max(max, rightData.max);
        }

        boolean isBinaryTree= true;
        if(leftData!=null &&(!leftData.isBinaryTree || leftData.max >= x.value)){
            isBinaryTree=false;
        }
        if(rightData!=null &&(!rightData.isBinaryTree || rightData.min >= x.value)){
            isBinaryTree=false;
        }


        return new returnType(isBinaryTree, min,max);
    }
}
