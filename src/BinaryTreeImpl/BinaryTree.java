package BinaryTreeImpl;

public class BinaryTree{

    private Node root;

    public void insert(int data){
        if(root == null){
            root = new Node(data);
            return;
        }
        insertWithNode(root, data);
    }

    private Node insertWithNode(Node currentNode, int data){
        if(currentNode == null){
            currentNode = new Node(data);
            return currentNode;
        }
        if(data < currentNode.data){
            currentNode.left = insertWithNode(currentNode.left, data);
        }
        else{
            currentNode.right = insertWithNode(currentNode.right, data);
        }
        return currentNode;
    }

    public void show(){
        showWithNode(root);
    }

    public void showWithNode(Node temp){
        if(temp == null){
            return;
        }
        showWithNode(temp.left);
        System.out.print(temp.data + " ");
        showWithNode(temp.right);
    }
}
