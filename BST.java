import java.rmi.server.SocketSecurityException;
import java.util.*;
public class BST {


//inOrder function 


   
    // que 1 = Build a BST {withg the help of BST 3 PROPERTIES}
    static class Node {
        int data;
        Node left;
        Node right;
        // constructor 
        Node(int data) {
            this.data = data;
        }
    }

    // insert method
    public static Node insert(Node root, int val) {
        // base case
        if (root == null) {
            root = new Node(val);
            return root;
        }
        // inserting element at the left side on the comparison with root node
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

     //que 2 = sEARCH A BST 
    //ON THE COMPARISON ON THE BASIS OF THE ROOT ELEMENT 

    public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return search(root.left , key);
        }
        else{
            return search(root.right , key);
        }
    }

    //QUE 3 = DELETE A NODE 
    //PROCEDURE = SEARCXG THE NODE VERIFY IT ABD DELETE THE NODE
    //CASE = THERE ARE 3 CASES 
    //NODES HAVE EITGHER ONE CHILD , 0 OR 2 CHILD 
    //CASE 1 = 0 CHILD = PASS NULL TO THEIR PARENTS 
    //CASE 2 = 1 CHILD = IGNORE OR SKIP 
    //CASE 3 = 2 CHILD = FIND INORDER SUCCESSO AND DELTE THE SUCCESSOR

    public static Node delete(Node root, int val) {
        if (root == null) {
            return null;
        }
        
        if (val < root.data) {
            root.left = delete(root.left, val);
        } else if (val > root.data) {
            root.right = delete(root.right, val);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            
            Node inorderSuccessor = findInorderSuccessor(root.right);
            root.data = inorderSuccessor.data;
            root.right = delete(root.right, inorderSuccessor.data);
        }
        
        return root;
    }
    
    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    

    public static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }


    //que 3 = print in range
    //There is a given range we need to print the valuers accordingly 
    //k1 k2 given hoga
    public static void printInRange(Node root , int k1 , int k2){
        //base case 
        if(root == null){
            return ;


        }
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left, k1, k2);
            System.out.println(root.data + " ");
            printInRange(root.right, k1, k2);
        }
         else if(root.data < k1){
             printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
    }

    //QUE4 = ROOT TO LEAF PATH
     //will gonna use concept of Array List 
     //procedure = print path funvctuion jo ki iterationb dikhayeg athern recursioin vala step 
     //FUNCTION 1 = print function  banaeyege kuki  for normal iteration
     public static void printPath(ArrayList<Integer>Path){
        for(int i = 0;i<Path.size(); i++){
            System.out.println(Path.get(i) + " ");
        }
        System.out.println();
     }

     //recursion function banayege 
     public static void printRoot2Leaf(Node root , ArrayList<Integer>Path){
        //base case 
        if(root == null){
            return ;
        }
        Path.add(root.data); //connerct path to root data
        if(root.left == null && root.right == null){
            return ;
        }
        printRoot2Leaf(root.left, Path);
        printRoot2Leaf(root.right, Path);
        Path.remove(Path.size()-1);

     }

     //QUE5 = VALIDAT BST = TO VERIFY ALL THE PROPERTIES OF A BST TO ANSWER THIS QUESTION
     //PROCEDURR = CHECK AND COMPARE MAX OF LEFT AND MIN OF RIGHT
     //TABBHI PATA CHZLREBG AKI Y EPROPERTY FOLLUP HO BHHI RHI HAI YA NHI 
     public static boolean isValidBst(Node root , Node min , Node max){
        //base case\ 
        if(root == null){
            return true ;
        }

        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }
        return isValidBst(root.left, min, root) && isValidBst(root.right,root,  max); //importasnce of root element

     }

     //QUE 6 = MIRROR A BST
     //PROCEDURE = NODE WILL RERMAI  TSAME BUT THE LST AND RST GONNA REPLACE EACH OTHER
     //root.left = right && roo.right == left for each bst present there 
     public static Node createMirror(Node root ){
        //base case 
        if(root == null){
            return null;

        }
        Node leftMirror =  createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        //apna logic lag adege hum yha 
        root.left = rightMirror;
        root.right = leftMirror;
        return root; 
     }

     //preordere 
      //1 - ROOT , 2 - LST , 3 - RST
      public static void preOrder(Node root){
        //base case 
        if(root == null){
            return ;  //return noting when return type is already null
        }
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
      }

      //QUE 7 = SORTED ARRAY INTO BALANXED BST 
      //PROCEDURE = ARRAY GIVEN HAI HUME THEN HUM MUD FIND KARENGE THEN LST AND RST BUT THESE ST have to folow all the property of bst k!
      public static Node createBst(int arr[] , int st , int end){
        //base case 
        if(st>end){
            return null;
        }
        int mid = (st + end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBst(arr, st, mid-1);
        root.right = createBst(arr, mid+1, end);
        return root;
      }

      //QUE 8 = CONMVERT BST INTO BALANCED BST
      //PROCEDURE = FIND INORDER SEQUENCE THERN COMB=VBERT IT INTO ARRAYLIST THEN ARRAYLIST INTO BALANCED BST 
      //proceed accordingly 
      public static void getInorder(Node root , ArrayList<Integer>inorder){
        //basew case 
        if(root == null){
            return ;
        }

        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
      }

      //create BST 
      public static Node createBst(ArrayList <Integer> inorder , int st , int end){
        //base case 
        if(st>end){
            return null;
        }
        int mid = (st + end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBst(arr, st, mid-1);
        root.right = createBst(arr, mid+1, end);
        return root;
      }

      //balamcing the node
      public static Node balancedBST(Node root){
        //inorder seq
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);
        root = createBst(inorder, 0,inorder. size()-1);
        return root;
      }
    public static void main(String args[]) {
        int values[] = {5, 1, 3, 4, 2, 7};
        // Node root = null;
        Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
            inOrder(root);

        //cal;long function for CREATE BST
        Node root = createBst(null, 0,arr.length-1);
        preOrder(root); 
    

    //calling secxond function 
        if(search(root, 1)){
        System.out.println("found");
        }else{
        System.out.println("nahi");
        }

    
    }
    //calling thoird functuion 
        inOrder(root);
        System.out.println();

        root = delete(root, 1);
        System.out.println();
        inOrder(root);


        printInRange(root, 0, 0);
        printRoot2Leaf(root, new ArrayList<>());

    //CALLING BOOLEAN FUNCTION
        if(isValidBst(root, null, null)){
        System.out.println("valid hai bhai");
        }      else{
        System.out.println("valid nhi hai lavcde");

        //calling preOrder 
        root = createMirror(root);
        preOrder(root);
        }
    
    }  
     
}
