package DSA.BinarySearchTree;

public class BinarySearchTree {
    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public void insert(int n) {
        Node newN = new Node(n);
        if(root==null){
            root = newN;
            return;
        }
        Node cur = root;
        while(true){
            if(n == cur.data){
                return;
            } 
            if(n < cur.data){
                if(cur.left==null) {
                    cur.left = newN;
                    return;
                }
                cur=cur.left;
            }else{
                if(cur.right==null) {
                    cur.right = newN;
                    return;
                }
                cur=cur.right;
            }
        }
        
    }
    void preorder(){
        if(root==null){
            System.out.println("NULL");
        }
        preorder(root);
        System.out.println("NULL");
    }
    void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"-->");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(7);
        tree.insert(1);
        tree.insert(3);
        tree.insert(8);
        tree.preorder();
    }
}
