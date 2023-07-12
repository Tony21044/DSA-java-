// import java.util.ArrayList;
// import javax.sound.sampled.SourceDataLine;
// import java.util.*;
// public class StackB{
//     // static class Stack{
//     static ArrayList <Integer> list = new ArrayList<> ();

//     //Empty function
//     public static boolean isEmpty(){
//         return list.size() == 0;
//     }
    
// //     //push 
//     public static void push(int data){
//         list.add(data);
//     }

//     //pop
//     public static int pop(){
//         int top = list.get(list.size() -1);
//         list.remove(list.size() -1);
//         return top;
//     }
    

//  //peek function 
// public static int peek(){
//     return list.get(list.size() -1);
// }

// public static void main(String args[]){
//     Stack S = new Stack();
//     S.push(1);
//     S.push(2);
//     S.push(3);

//     while (!S. isEmpty()){
//         System.out.println(S.peek());
//         S.pop();
//     }
// }
    
// //}

// // Usage if LL is remaining
// // Que 1 = PUSH AT THE BOTTOM OF THE STACK 
// // process = phle pop form the top and then push accordingly to the neeeds
// public class StackB{
//     public static void pushAtBottom(Stack <Integer> S , int data){

//         //base case 
//         if(S .isEmpty()){
//             S.push(data);
//             return;
//         }

//         //pop\
//         int top = S.pop();
//         pushAtBottom(S, data);
//         S.push(top);
//         }
    
//         public static void main(String args[]){
//             Stack <Integer> S = new Stack();
//             S.push(1);
//             S.push(2);
//             S.push(3);
//             pushAtBottom(S, 4);
//             while(!S.isEmpty()){
//                 System.out.println(S.pop());
//             }



//         }

//     }
// }

//Que 2 = Reverse a string using Stack 
// //Process = push into a stacjk thern pop out acc as per order 
// public static String reverseString(String str){
//     Stack<Character> S = new Stack <>();
//     int idx = 0;
//     while(idx<str.length()){
//         S.push(str.charAt(idx));
//         idx++;
//     } 
//     StringBuilder result = new StringBuilder(" ");
//     while(!S.isEmpty()){
//         char curr = S.pop();
//         result.append(curr);
//     }
//     return result.toString();
// }
// public static void main(String args[]){
//     String str = "abc";
//     String result = reverseString(str);
//     System.out.println(result);
// }
// }

//QUE - STOCK SPAN PROBLEM 
// public static void stockSpan(int stocks [], int span[]){
//     Stack<Integer> S = new Stack <>();
//     span[0] = 1;
//     S.push(0);
//     for(int i = 1;i<stocks.length; i++){
//         int currPick = stocks[i];
//     // vahi kisi bhi for loop me 3 must conditions hongi hii 
//     while(!S . isEmpty() && currPick > stocks[S.peek()]){
//         S.pop();
//     }
//     if(S.isEmpty()){
//         span[i] = i+1;
//     }else{
//         int prevHigh = S.peek();
//         span[i] = i-prevHigh;
//     }
//     S.push(i);
//     }
// }
// public static void main(String args[]){
//     int stocks[] = {100,80,60,70,60,85,100};
//     int span[] = new int[stocks . length];
//     stockSpan(stocks, span);
//     for(int i = 0; i<span.length ; i++){
//         System.out.println(span [i] + " ");
//       }
//     }
// }

// Que = Next greater element 
// public static void main(String args[]){
//     int arr[] = {6,8,0,1,3};
//     Stack <Integer> S = new Stack <>();
//     int nextGreater[] = new int[arr.length];

//     //Reverse Loop
//     for(int i = arr.length-1 ; i>=0 ; i--){
//         //Going for 3 part 
//         //while 
//         while(!S.isEmpty() && arr[S.peek()] <= arr[i]){
//             S.pop();
//         }
//     //2 if-else
//     if(S.isEmpty()){
//         nextGreater[i]=-1;   
//      }else{
//         nextGreater[i] = arr[S.peek()];
//      }
//      S.push(i);
//     }
//     for(int i = 0; i<nextGreater.length; i++){
//         System.out.print(nextGreater[i] + " ");
//     }
//     System.out.println();
// }
// }

//Que = Chceking the given string of symbols is valid or not 
// public static boolean isValid(String str){
//     Stack < Character > s = new Stack <>();
//     //LOOP
//     for(int i = 0; i<str.length(); i++){
//         char ch = str.charAt(i);

//         //checking the opening and the closing ones
//         if(ch == '(' || ch == '{' || ch == '['){
//             s.push(ch);
//         }else{
//             //closing //stack is empty or  not
//             if(s.isEmpty()){
//                 return false;
//             }
//             if((s.peek() == '(' && ch == ')')
//             || (s.peek() == '{' && ch == '}') 
//             || (s.peek() == '[' && ch== ']')){
//                 s.pop();

//             } else{
//                 return false;
//             }
            
//         }
//     }
//     return false;
// }
// public static void main(String args[]){
//     String str = "()({})[]]";
//     System.out.println(isValid(str));
// }

//Que = Duploicate parenthersis
// public static boolean isDuplicate(String str){
//     Stack <Character> S = new Stack<>();
//     for(int i = 0;i<str.length();i++){
//         char ch = str.charAt(i);
//         //closing condition 
//         if(ch == ')'){
//             int count = 0;
//             while(S.peek() != '('){
//                 S.pop();
//                 count ++;
//             }
//             //curcial condition i need to learn about
//             if(count < 1){
//                 return true;
//             }
//             else{
//                 S.pop();
//             }else{
//                 //PUSH
//                 //POP VAL CODNTION HUM IKH  CHUJEG HAI PHLE HI 
//                 S.push(ch);    
//             }
//         }
  
//         return false;
// }
//     public static void main(String args[]){
//         String str = "(a+b))";
//         String str2 = "(a-b)";
//         System.out.println(isDuplicate(str));
//     }

// }
// }

//QUE = 