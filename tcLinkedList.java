// import java.util.LinkedList;
// import java.util.*;

// public  class tcLinkedList{
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     //addFirst function 
//     public static Node head;
//     public static Node tail;
//     private static int size;
    
//     public static void addFirst(int data){
//         //Step 1 = ccrerate a new node 
//         Node newNode = new Node(data);
//         //Base case 
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         //Step 2 =  Linking steep 
//         newNode.next = head; //New node ke next ko mene purane first node se connect kardia
//         //Step 3 = new Node inserted ;
//         head = newNode;

//     }

//     //addLast function for LL
//     public static void addLast(int data){
//         //Step 1 = creation of new node no matter it is in  front or at the end of the LL
//         Node newNode = new Node(data);
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         //Step 2 The linkage step of LLL
//         tail.next = newNode;
//         //Step 3 = The final confirmation 
//         tail = newNode;    
//     }
//     //Print function for a LL
//     public void print(int data){
//         //base cond
//         if(head == tail){
//             System.out.println("ll is empty ");
//             return;
//         }
//         Node temp = head;
//         while( temp != null){
//             System.out.println(temp.data + " ");
//             temp = temp.next;
//         }
//             System.out.println();
//     } 

//     //Add in the middle of the ll
//     //Adding new node between the given nodes
//     public void add(int data , int idx){
//         //creating a nodfe 
//         Node newNode = new Node( data);
//         Node temp = head;
//         int i = 0;
//         while(i<idx-1){
//             temp = temp.next;
//             i++;
//         }
//         newNode.next = temp.next;
//         temp.next = newNode;
//         if(idx == 0){
//             addFirst(data);
//             return;
//         }
//     }
   
//     //Remove a Linked   List
//     //ERemove FAIRST
//     public int removeFirst1(){
      
//         int val = head.data; //rat le bhenchod 
//         head = head.next; ////rat le bhenchod 
//         return val;
        
//     }
//     //2 Imp cases when ll is empty or wit the size of 1
//     public static int removeFirst(){
        
       
//         if(size == 0){
//             System.out.println(" ll is empty ");
//         return Integer.MIN_VALUE;
//         }
        
//     else if(size ==1){
//         int val = head.data;
//         head = tail = null;
//         size = 0;
//         return val;
//     }
//     int val = head.data;
//     head = head.next;
//     size--;
//     return val;
// }

// //Search in LL ITERATIVE WAY



    
//     public static void main(String args[]){
//         LinkedList ll = new LinkedList();
//         ll.print();
//         ll.addFirst(1);
//         ll.print();
//         ll.addFirst(2);
//         ll.addLast(3);
//         ll.addLast(4);

//     }
// }