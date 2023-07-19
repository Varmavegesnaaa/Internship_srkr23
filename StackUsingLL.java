package Intern;
import java.util.*;
class Node{
    int data;
    Node next;
}
class Stack{
    Node top;
    Stack(){
        this.top=null;
    }
}
public class StackUsingLL {
    boolean isEmpty(Stack stack){
        if(stack.top==null){
            return true;
        }
        return false;
    }
    void push(Stack stack,int ele){
        Node newnode = new Node();
        newnode.data = ele;
        if(isEmpty(stack)){
            stack.top = newnode;
        }
        else{
            newnode.next = stack.top;
            stack.top = newnode;
        }
    }
    int pop(Stack stack){
        if(!isEmpty(stack)){
            int ele = stack.top.data;
            stack.top = stack.top.next;
            return ele;
        }
        return -1;
    }
    int peek(Stack stack){
        if(!isEmpty(stack)){
            int ele = stack.top.data;
            return ele;
        }
        return -1;
    }
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        StackUsingLL obj = new StackUsingLL();
        System.out.println("*****Menu*****\n1.PUSH\n2.POP\n3.PEEK\n4.DISPLAY\n5.EXIT");
        System.out.println("Enter choice : ");
        ch = sc.nextInt();
        while(true){
            if(ch==5){
                break;
            }
            switch(ch){
                case 1 : 
                    int ele_push;
                    System.out.println("Enter element : ");
                    ele_push = sc.nextInt();
                    obj.push(stack,ele_push);
                    break;
                case 2 :
                    int ele_pop;
                    ele_pop = obj.pop(stack);
                    if(ele_pop==-1){
                        System.out.println("Stack is Empty");
                    }
                    else{
                        System.out.println("Element popped is : "+ele_pop);
                    }
                    break;
                case 3 : 
                    int ele_peek;
                    ele_peek = obj.peek(stack);
                    if(ele_peek==-1){
                        System.out.println("Stack is Empty");
                    }
                    else{
                        System.out.println("Element on peek is : "+ele_peek);
                    }
                    break;
                case 4 :
                    if(obj.isEmpty(stack)){
                        System.out.println("Stack is Empty");
                    }
                    else{
                        Node temp;
                        temp = stack.top;
                        while(temp!=null){
                            System.out.println("|"+temp.data+"|");
                            temp = temp.next;
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid input");
            }
            System.out.println("*****Menu*****\n1.PUSH\n2.POP\n3.PEEK\n4.DISLAY\n5.EXIT");
            System.out.println("Enter choice : ");
            ch = sc.nextInt();
        }
    }
}
