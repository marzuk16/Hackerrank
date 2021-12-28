class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
        left = right = null; 
    }
}

public class Tree{
    Node root;

    int maxDepth(Node node){
        if(node == null) return 0;
        else{
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);
            
            return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
        }
    }
    public static void main(String[] args){
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(2);
        tree.root.left.right.left = new Node(2);
        tree.root.right.left = new Node(3);

        System.out.println("Height of tree is: " + tree.maxDepth(tree.root));
    }
}