//QUE1 = INTERLEAVE OF DATA

// import java.util.*;
// import java .util. LinkedList;
// public class queueC{
//     public static void interLeave(Queue<Integer>q){
//         Queue<Integer> firstHalf = new LinkedList<>();
//         int size = q.size();
//         for(int i = 0;i<size/2;i++){
//             firstHalf.add(q.remove());
//         }
//         while(!firstHalf . isEmpty()){
//             q.add(firstHalf.remove());
//             q.add(q.remove());
//         }
//     }
//    public static void main(String args[]){
//     Queue<Integer> q = new LinkedList<>();
//     q.add(1);
//     q.add(2);
//     q.add(3);
//     q.add(4);
//     q.add(5);
//     q.add(6);
//     q.add(7);
//     q.add(8);
//     q.add(9);
//     q.add(10);

//     while(!q.isEmpty()){
//         System.out.println(q.remove() + " ");
//     }
//     System.out.println();
//    }
// } 
//Que - Implementation of queue using stacks and queue 
//procedure - we need to perform three operations 
//STACKS
//     static class stack{
//         Deque <Integer> deque = new LinkedList<>();

//         //operations to be performed 
//     //push
//     public void push(int data){
//         deque.addLast(data);
//     }

//     //pop
//     public int pop(int data){
//      return deque.removeLast();
//     }

//     //peek
//     public int peek(int data){
//         return deque.getLast();
//     }

//     public static void main(String args[]){
//         Stack s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         System.out.println("peek = " + s.peek() );
//         System.out.println(s.pop());
//         System.out.println(s.pop());
//         System.out.println(s.pop());

//     }
        
//     }
// }


// static class    Queue{
//     Deque <Integer> deque = new LinkedList<>();

//     //operations to be performed 
// //push
// public void add(int data){
//     deque.addLast(data);
// }

// //pop
// public int remove(){
//  return deque.removeFirst();
// }

// //peek
// public int peek(){
//     return deque.getFirst();
// }
// }

// public static void main(String args[]){
//     Queue q = new Queue();
//     q.add(1);
//     q.add(2);
//     q.add(3);
//     System.out.println("peek = " + q.peek() );
//     System.out.println(q.remove());
//     System.out.println(q.remove());
//     System.out.println(q.remove());


    
// }

// private String peek() {
//     return null;
// }

// private char[] remove() {
//     return null;
// }
// }

