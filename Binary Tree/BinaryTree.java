import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//updated

class Node{
    String data;
    Node left;
    Node right;
    public Node(String data){
        this.data =data;
    
    }
}

public class BinaryTree{
    Node root;
    
    public BinaryTree(){
        this.root=null;
    }

    void preOrder(Node node){
        if(node ==null){
            return;
        }
        System.out.println(node.data+ " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void inOrder(Node node){
        if(node ==null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.data+ " ");
        inOrder(node.right);

    }
    void postOrder(Node node){
        if(node ==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data+ " ");


    }
    void levelOrder(){
        if(root==null){
            System.out.println("The Tree is Empty!");
            return;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node presentNode = queue.remove();
            System.out.print(presentNode.data + " ");
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }

        }


    }
    void insert(String value){
        Node newnNode = new Node(value);
        if(root==null){
            root=newnNode;
            System.out.println("The Node has been added to root");
            return;
        }
        Queue<Node> queue =new LinkedList<Node>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node presentNode = queue.remove();
            if(presentNode.left==null){
                presentNode.left = newnNode;
                System.out.println("The Node has been added");
                break;
            }
            else if(presentNode.right==null){
                    presentNode.right = newnNode;
                    System.out.println("The Node has been added");
                    break;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);

        }
    }

    void delete(){
        root = null;
        System.out.println("The Tree has been deleted!");

    }

    void search(String value){
        Queue<Node> queue =new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node presentNode = queue.remove();
            if(presentNode.data == value){
                System.out.println("The value "+value+" has been found!");
                return;
            }
            if(presentNode.left!=null){
            queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
                }
            
        }
        System.out.println("The value "+value+" is not in the Tree!");

        

    }

    public static void main(String[] args){
        BinaryTree bt=new BinaryTree();

        bt.levelOrder();
        bt.insert("N1");
        bt.insert("N2");
        bt.insert("N3");
        bt.insert("N4");

        bt.preOrder(bt.root);
        bt.search("N4");
        bt.delete();



    }

    
}