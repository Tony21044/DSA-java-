// import javax.xml.namespace.QName;
// import java.util.*;
// import java.util. LinkedList;

// public class queueB{
//     //Implementation of queue bhi sath me hi hai 
//     //circular queue with arrays 
//     static class queue{
//         static int arr[];
//         static int size;
//         static int rear;
//         static int front;
//         queue(int n){
//             arr= new int[n];
//             size= n;
//             rear = -1;
//             front = -1;
//         }
//         //isEmpty()
//         public static Boolean isEmpty(){
//             return rear == -1 && front == -1;
//         }

//         //ful function 
//         public static boolean isFull(){
//             return (rear+1)% size ==front;

//         }
//         //ADD FUNBCTION
//         public static void add(int data){   // void hai to paramw me data inp
//             // if(rear == size-1){
//                 if(isFull()){
//                 System.out.println("QUEUE IS FULL");
//                 return;
//             }
//             //add first element 
//             if(front  == -1){
//                 front = 0;
//             }
//             rear = (rear +1)%size ;
//             arr[rear] = data; // data store kara dia arr of rear mein 
//          }
        

//          //remove function opr delete functio ();
//          public static int remove(){
//             if(isEmpty()){
//                 System.out.println("QUEUE IS EMPTY|");
//                 return-1;
//             }
//             // int front = arr[0];
//             // for(int i=0;i<rear;i++){
//             //     arr[i] = arr[i+1]; 
//             // } 
//             int result = arr[front];
//             if(rear == front){
//                 rear = front =-1;
//             }else{
//             front = (front+1)%size;
//             // rear = rear-1;
//             return result;
//             }
//             return result;
//        }
//     //peekbfunction 
//     public static int peek(){
//         if(isEmpty()){
//             System.out.println("empty");
//             return -1;
//         }
//         return arr[front];
//     }
// }
//     public static void main(String args[]){
//         queue q = new queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         System.out.println(q.remove());
//         q.add(4);
//         System.out.println(q.remove());
//         q.add(5);System.out.println(q.remove());
//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }



//Que 1 = quesue using Linked Lis
    // static class Node{
    //     int data;
    //     Node next;
    //     public queueB.Node Next;

    //     //constructor 
    //     Node(int data){
    //         this.data = data;
    //         this.next = null;  // yad krl bsdk in steps ko 
    //     }
    // }
    // static class queue{
    //     static Node head = null;
    //     static Node tail = null;
    //     //isempty function
    //     public static boolean isEmpty(){
    //         return head ==  tail && tail == null; //ese hi kyu likhaa????
    //     }

    //     //ADD FUNCTION 
    //     public static void add(int data){
    //         Node newNode = new Node(data);
    //         if(head == null){
    //             head = tail = newNode;  // empty condition 
    //             return;
    //         }
    //         tail.Next = newNode;
    //         tail = newNode;
    //     }

    //     //remove funbction 
    //     public static int remove(){
    //         if(isEmpty()){
    //             System.out.println("empty behencbod");
    //             return -1;
    //         }

    //         int front = head.data;
    //         if(tail == head){
    //             tail = head = null;
    //         }else{
    //             head = head.next;
    //         }
    //         return front;
    //     }

    //     //PEEK FUNCTION JUST TO CHGECK THE VALUE OF THGE HEAD 
    //     public static int peek(){
    //         if(isEmpty()){
    //             System.out.println("empty behenchod");
    //             return-1;
    //         }
    //         return head.data;
    //     }
    // }
    // public static void main(String args[]){
    //     queue q = new queue();
    //             q.add(1);
    //             q.add(2);
    //             q.add(3);
    //             System.out.println(q.remove());
    //             q.add(4);
    //             System.out.println(q.remove());
    //             q.add(5);System.out.println(q.remove());
    //             while(!q.isEmpty()){
    //                 System.out.println(q.peek());
    //                 q.remove();
    //             }
    //         }

    // }
//que 2 = Queue using 2 stacks 
//oprocedure = FIF0 + FIFO = LIFO 
//We gonna use tc of 0(n) and o(1) 
//ADD FUN ME = 3 STEPS PROPCUSDR FOLOW UP KAREGE 
// static class queue{
//     static Stack <Integer> s1 = new Stack<>(); 
//     static Stack <Integer> s2 = new Stack<>();

//     //is empty func 
//     public static boolean isEmpty(){
//         return s1.isEmpty();         

//     }

//     //ADD FUNCTIONM
//     public static void add(int data){
//         while(!s1.empty()){
//             s2.push(s1.pop());
//         }
//         s1.push(data);
//         while(!s2.isEmpty()){
//             s1.push(s2.pop());
//         }
//     }

//     //remove function 
//     public static int remove(){
//         if(isEmpty()){
//             System.out.println("queue is empty");
//             return -1;
//         }

//         return s1.pop();
//     }

//     //PEEK BFUNCTION 
//     public static int peek(){
//         if(isEmpty()){
//             System.out.println("empty");
//             return -1;
//         }
//         return s1.peek();
//     }

// }   

// public static void main(String args[]){
//     queue q = new queue();
//     q.add(1);
//     q.add(2);
//     q.add(3);
//     while(!q.isEmpty()){
//         System.out.println(q.peek());
//         q.remove();
//     }
// }

//QUE 3 = IMPLEMENT A STACK USING 2 QUSUES 
//PROCEDURE = WE GONNA USE PUSH AND POP FUNCTIONS ON THER END OF THE DIFFERNT COOMPLEWXOITIES 
// static class Stack{
//     static Queue <Integer> q1 = new LinkedList<>(); 
//     static Queue <Integer> q2 = new LinkedList<>(); 

//     //ISEMPTY
//     public static boolean isEmpty(){
//         return q1.isEmpty() && q2.isEmpty();
//     }
//     //push
//     public static void push(int data){
//         if(!q1.isEmpty()){
//             q1.add(data);
//         }else{
//             q2.add(data);
//         }
//     }
//     //pop func
//     public static int pop(){
//         if(isEmpty()){
//             System.out.println("empty bhenchod");
//             return -1;
//         }
//         int top = -1;
//         if(!q1.isEmpty()){
//             while(!q1.isEmpty()){
//                 top = q1.remove();
//                 if(q1.isEmpty()){
//                     break;
//                 }
//                 q2.add(top);

//             }
            
//             }else{
//                 while(!q2.isEmpty()){
//                     top = q2.remove();
//                     if(q2.isEmpty()){
//                         break;
//                     }
//                     q1.add(top);
//                 }
//         }
//         return top;


//     }
//     //peek function 
//     public static int peek(){
//         // public static int pop(){
//             if(isEmpty()){
//                 System.out.println("empty bhenchod");
//                 return -1;
//             }
//             int top = -1;
//             if(!q1.isEmpty()){
//                 while(!q1.isEmpty()){
//                     top = q1.remove();
//                     // if(q1.isEmpty()){
//                     //     break;
//                     // }
//                     // q2.add(top);
    
//                 }
                
//                 }else{
//                     while(!q2.isEmpty()){
//                         top = q2.remove();
//                     //     if(q2.isEmpty()){
//                     //         break;
//                     //     }
//                     //     q1.add(top;)
//                     // }
//             }
//             return top;
    

//     }

// }
// public static void main(String args[]){
//     Stack s = new Stack();
//     s.push(1);
//     s.push(2);
//     s.push(3);

//     while(!s.isEmpty()){
//         System.out.println(s.peek());
//         s.pop();
//     }
// }

// private static String str;

// }
//QUE 4 = NON REPEATING CHARACTER FROM THE STREAM OF CHARACTERS 
// public static void printNonRepeating(String args[]){
//     int freq[] = new int[26];
//     Queue <Character> q = new LinkedList<>(); //QUEUE
//     for(int i = 0; i<str.length(); i++){
//         char ch = str.charAt(i);
//         q.add(ch);
//         freq[ch - 'a']++;
//     while(!q.isEmpty() && freq[q.peek() - 'a']>1){
//         q.remove();

//     }
//     if(q.isEmpty()){
//         System.out.println(-1 + " ");
//     }else{
//         System.out.println(q.peek() + " ");
//     }

//     }
// } 
//  }




