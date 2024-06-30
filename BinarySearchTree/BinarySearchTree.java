package BinarySearchTree;

public class BinarySearchTree {
    Node root;
    
    BinarySearchTree(){
        this.root=null;
    }
    public Node insert(Node currentNode,int value){
        if(currentNode == null){
            Node newNode = new Node(value); 
            System.out.println("The value has been inserted in the root!");
            return newNode;
        }
        else if(value <= currentNode.data){
            currentNode.left = insert(currentNode.left,value);
            return currentNode;
        }else{
            currentNode.right = insert(currentNode.right,value);
            return currentNode;
        }
    }
    void insert(int value){
        root = insert(root,value);
    }
    public void preOrder(Node node){
        if(node ==null){
            return;
        }
        System.out.println(node.data+ " ");
        preOrder(node.left);
        preOrder(node.right);
    }
   
}
