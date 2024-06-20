import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
    void levelOrder(Node node){
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

    public static void main(String[] args){
        BinaryTree bt=new BinaryTree();
        Node n1 =new Node("N1");
        Node n2 =new Node("N2");
        Node n3 =new Node("N3");
        Node n4 =new Node("N4");
        Node n5 =new Node("N5");
        Node n6 =new Node("N6");
        Node n7 =new Node("N7");
        Node n8 =new Node("N8");
        Node n9 =new Node("N9");




        
        n1.left =n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;
        n3.left =n6; 
        n3.right=n7;
        n4.left = n8;
        n4.right=n9;
        bt.root=n1;

        bt.levelOrder(bt.root);



    }

    
}