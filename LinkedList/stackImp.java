package LinkedList;

import java.util.Scanner;


public class stackImp {
    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next = null;
        }  
    }
    static class Stack{
        public static Node head;
        public static boolean isEmpty() {
            return head == null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public void pop() {
            if(isEmpty()){
                return;
            }
            head= head.next;
        }
        public int peek() {
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
        
        public void display()
        {
            // check for stack underflow
            if (head == null) {
                return;
            }
            else {
                Node newNode = head;
                System.out.println("\nStack is:");

                while (newNode != null) {
                
                    // print node data
                    System.out.printf("%d->", newNode.data);
                
                    // assign temp link to temp
                    newNode = newNode.next;
                }
            }
        }
        // public void pushElement(){
        //     Scanner sc2 = new Scanner(System.in);
        //     int element = sc2.nextInt();
        //     Stack.push(element);
        //     sc2.close();
        // }
        public int size(){
            Node top = head;
            int count=0;
            if(isEmpty()){
                return 0;
            }
            while(top!=null){
                count++;
                top = head.next;
            }
            return count;
        }
        

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int element;
        for (int i = 0; i <= n; i++) {
            String operation = sc.next();
            if(operation.equals("push")){
                //s.pushElement();
                int element = sc.nextInt();
                Stack.push(element);
            } if(operation.equals("pop")){
                s.pop();
            }else if(operation.equals("display")){
                s.display();
            }else if(operation.equals("size")){
                System.out.println(s.size());
                
            }
        }
        sc.close();

        // s.push(1);
        // s.push(2);
        // s.push(32);
        // s.push(12);
        // s.push(8);
        // s.push(4);
        // s.push(10);
        // s.display();
        // s.pop();
        // s.pop();
        // s.display();
    }
    
}
