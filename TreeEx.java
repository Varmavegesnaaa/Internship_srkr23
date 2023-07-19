import java.util.Scanner;

import javafx.scene.paint.Stop;
class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
class TreeEx{
    Node create(Node root){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data(-1 to stop):");
        int data;
        data = sc.nextInt();
        root = new Node(data);
        while(data!=-1){
            Node newnode = new Node(data);
            System.out.println("Enter data(-1 to stop):");
            data = sc.nextInt();
            insert(root,newnode);
        }
        return root;
    }
    void insert(Node root,Node newnode){
        if(newnode.data < root.data){
            if(root.left == null){
                root.left = newnode;
            }
            else{
                insert(root.left,newnode);
            }
        }
        else if(newnode.data > root.data){
            if(root.right == null){
                root.right = newnode;
            }
            else{
                insert(root.right,newnode);
            }
        }
    }
    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
    void preorder(Node root){
        if(root!=null){
            System.out.println(root.data);
            inorder(root.left);
            inorder(root.right);
        }
    }
    void postorder(Node root){
        if(root!=null){
            inorder(root.left);
            inorder(root.right);
            System.out.println(root.data);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        TreeEx obj = new TreeEx();
        root = obj.create(root);
        int ch;
        System.out.println("MENU\n1.Insert\n2.Inorder\n3.Preorder\n4.Postorder\n5.Exit");
        System.out.println("Enter choice:");
        ch = sc.nextInt();
        while(true){
            if(ch==5){
                break;
            }
            switch(ch){
                case 1 :
                    int data;
                    System.out.println("Enter data:");
                    data = sc.nextInt();
                    Node newnode = new Node(data);
                    obj.insert(root,newnode);
                    break;
                case 2:
                    obj.inorder(root);
                    break;
                case 3:
                    obj.preorder(root);
                    break;
                case 4:
                    obj.postorder(root);
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
            System.out.println("MENU\n1.Insert\n2.Inorder\n3.Preorder\n4.Postorder\n5.Exit");
            System.out.println("Enter choice:");
            ch = sc.nextInt();
        }
    }
}
