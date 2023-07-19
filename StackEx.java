package Intern;
import java.util.*;
class Stack {
    int size=6;
    int arr[] = new int[size];
    int top=-1;
    boolean isEmpty(){
        if(this.top==-1){
            return true;
        }
        return false;
    }
    boolean isFull(){
        if(this.top==size-1){
            return true;
        }
        return false;
    }
    void push(int ele){
        if(!isFull()){
            this.top++;
            this.arr[top] = ele;
        }
    }
    int pop(){
        if(!isEmpty()){
            int ele = this.arr[top];
            this.top--;
            return ele;
        }
        return -1;
    }
    int peek(){
        if(!isEmpty()){
            int ele = this.arr[top];
            return ele;
        }
        return -1;
    }
}
class StackEx{
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        System.out.println("*****Menu*****\n1.PUSH\n2.POP\n3.PEEK\n4.DISPLAY\n5.EXIT");
        System.out.println("Enter choice : ");
        ch = sc.nextInt();
        while(true){
            if(ch==5){
                break;
            }
            switch(ch){
                case 1 : 
                    if(!stack.isFull()){
                        int ele_push;
                        System.out.println("Enter element : ");
                        ele_push = sc.nextInt();
                        stack.push(ele_push);
                    }
                    else{
                        System.out.println("Stack is Full");
                    }
                    break;
                case 2 :
                    int ele_pop;
                    ele_pop = stack.pop();
                    if(ele_pop==-1){
                        System.out.println("Stack is Empty");
                    }
                    else{
                        System.out.println("Element popped is : "+ele_pop);
                    }
                    break;
                case 3 : 
                    int ele_peek;
                    ele_peek = stack.peek();
                    if(ele_peek==-1){
                        System.out.println("Stack is Empty");
                    }
                    else{
                        System.out.println("Element on peek is : "+ele_peek);
                    }
                    break;
                case 4 :
                    if(stack.isEmpty()){
                        System.out.println("Stack is Empty");
                    }
                    else{
                        for(int i=stack.top;i>=0;i--){
                            System.out.println("|"+stack.arr[i]+"|");
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
