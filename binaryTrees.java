/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import javax.management.relation.InvalidRoleInfoException;
import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class binaryTrees {
    //BINARY TREES = A HEIRARICHAL DATA STRUCTURE
    // static class Node{
    //     int data;
    //     Node left;
    //     Node right;

    //     Node(int data){  //constructor
    //         this.data = data;
    //         this.left =  null;
    //         this.right =  null;

    //     }
    // }
//     static class binaryTreeB{
//         static int idx = -1;
//         public static Node buildTree(int nodes[]){
//             idx++;
//             if(nodes[idx] == -1){
//                 return null;
//             }
//             Node newNode =new Node(nodes[idx]);
//             newNode.left = buildTree(nodes); //buildtree = help us to build build trees 
//             newNode.right = buildTree(nodes);
//             return newNode;
//         }
    

//     //preorder transversal 
//     //pre = phle root then left then right 
//     public static void preorder(Node root){
//         //base caqse 
//         if(root == null){
//             return;
//         }
//         System.out.println(root.data + " ");
//         preorder(root.left);
//         preorder(root.right);

//     }


// //Inorder traversal of nodes 
// //Inorder = LEFT , ROOT , RIGHT 
// public static void inorder(Node root){
//     if(root == null){
//         return;
//     }
//     inorder ( root.left);
//     System.out.println(root.data + " ");
//     inorder(root.right);

//         }
// }    
//         public static void main(String args[]){
//         int nodes[] = { 1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//         binaryTreeB tree = new binaryTreeB();
//         tree.preorder(null);
//         tree.inorder(null);
//         System.out.println(root.data);
//     }
//QUE = HEIGHT OF A TREE 
//HEIGHT CAN BE CALCULATED ON THER BASIS OF THER NODES AND THE EDGES 
static class Node{
    int data;
    Node left , right;

    public Node(int data){
        this.data = data;
        this.left = null;  //??
        this.right = null; //??
    }
}
public static int height(Node root){
    if(root == null){
        return 0;
    }

    int ln = height(root.left);
    int rn = height(root.right);
    return Math.max(ln,rn) + 1;
}   

//Count of a node
//coutnting ther number o0f noes
// public static int count(Node root){
//     if(root == null){
//         return 0;
//     }
//     int leftcount = count(root.left);
//     int rightcount = count(root.right);
//     return leftcount + rightcount +1;
// }

// //sum of nodes 
// //lst + rst + root ki vcalue 

// public static int sum(Node root){
//     if(root == null){
//         return 0 ;
//     }
//     int leftsum = sum(root.left);
//     int rightsum = sum(root.right);
//     return leftsum + rightsum + root.data;
// }


//Diameter of as tre = The total nu of nodes between the lkeaf and the root , it has tro cut the leaf and also choose ther longest leafff.
//gonna finf left diam and ht and same foer ytherb ri8 and a selfdiam (lh + rh + 1)
// public static int diameter(Node root ){
//     if(root == null){
//         return 0;
//     }
//     int leftDiam = diameter(root.left);
//     int leftHt = height(root.left);
//     int rightDiam = diameter(root.right);
//     int rightHt = height(root.right);

//     int selfDiam = leftHt+rightHt+1;
//     return Math.max(selfDiam , Math.max(rightDiam, leftDiam));
// }

//Diameter of a tree by usinfg sedond approach 
////SEC APP = GOING TO DO ALL OPRATIONS IN ONE FUNCTJION 
//goin to make only one functions shyd to static class and constructor banayenge
static class Info{
    int diam;
    int ht;
public Info(int diam , int ht){
    this.diam = diam;
    this.ht = ht;
    }
}

public static Info diameter2(Node root){
    //baase case
    if(root == null){
        return newInfo(0,0);
    }
    Info leftInfo = diameter2(root.left);
    Info rightInfo = diameter2(root.right);

    int diam = Math.max(Math.max(leftInfo.diam , rightInfo.diam) , leftInfo.ht+ rightInfo.ht+1 +1);
    int ht =- Math.max(leftInfo.ht, rightInfo.ht) + 1;
    return new Info(diam, ht);
}

private static binaryTrees.Info newInfo(int i, int j) {
    return null;
}


//Subtree of another trewe 
//GGonna check them 
//comparision on the basis of identicallity = null elements 
// public static boolean isIdentical(Node root , Node subRooNode){
//     //Idenctical roots
//     if(node == null && subRoot == null){
//         return true;
//     }else if(node == null || subRoot == null || node.data != subRoot.data){
//         return false;
//     }
//     if(!isIdentical(node.left, subRootNode.left)){
//         return false;
//     }if(!isIdentical(node.right, subRooNode.right)){
//         return false;
//     }
//     return true ;
// }

// public static boolean isSubtree(Node root , Node subRoot){
//     //base case
//     if(root == null){
//         return false;

//     }
//     if(root.data == subRoot.data){
//         if(isIdentical(root, subRoot)){
//             return true;
//         }
//     }

//Top view of a binary tree
//WE NEED TO FIND TH0SE NODES WHICH ARE VISIBLE FROM THE TOP SIDE OF THE VIEW 
//gona use new data structure HASH MAP 
//Hash map = to store key and values 
////gonna use HORIZONTAL LINES VALUIE TO FIGURE THIS OUT (-2 -1 0 1 2 )
//LEVEL ORDERING TRACERSAL WILL ALSO GONNA USE 

    //static claass and a constructor
//QUE = KTH LEVEL OF A TREE
//APPROCACH = RECURSION 
public static void KLevel(Node root , int level , int k ){
    if(root == null){
        return ;
    }
    if(level ==k){
        System.out.println(root.data + " ");
        return;
    }
    //else condition
    KLevel(root.left, level+1, k);
    KLevel(root.right, level+1, k);  
}

//QUE = LCA = LOWEST COMMON ANCESTOR 
//PROCEDURE = WE NEED TO KNOW OUR K NODES AND ROOT NODE THEN WE GONNA FIND OUR PATH BTWN THEM THENW WE GONA FIND THE COMMAN PATH AND THEN WE GOT OUR ANSWER 
//STEPS 1 = ROOT TO  NODE = GETPATH()
//STEPE2 = LOOP FOR GOING TO K FROM NODE 
public static boolean getPath(Node root , int n, ArrayList<Node>path){
    if(root == null){
        return false;

    }
    path.add(root);
    if(root.data == n){
        return true;
    }
    //false conditon
    boolean foundLeft = getPath(root.right, n, path);
    boolean foundRight = getPath(root.right, n, path);

    if(foundLeft || foundRight){
        return true;
    }
    //else
    path.remove(path.size()-1);  //smj nhibay a
    return false;
    }


public static Node lca (Node root , int n1 , int n2){
    //arrayList
    ArrayList<Node>path1 = new ArrayList<>();
    ArrayList<Node>path2 = new ArrayList<>();


    //FUNCTION FOR CALLING ALS 
    getPath(root , n1 , path1);
    getPath(root , n2 , path2);


    //loop for iteratioon 
    int i = 0;
    for(; i<path1.size()&&i<path2.size(); i++){
        if(path1.get(i) != path2.get(i)){
            break;
        }
    }

    //last nahi to scond last to hoga hi 
    Node lca = path1.get(i-1);
    return lca;
}

//MINIMUM DISTANCE BETWEEN NODES = PROCEDURE = COUNT NUMBER OF BARS BETEWEEN GIVEN NDOES 
//GONNA USE APROACH OF LCA = N1 + N2 KA DISTANCE BCS N1 AND N2 ARE MOST PROBALLY GONNA BBE IN DIFFERENE T SUB TRES SO WE CAN USE LCA FOR BOTH OF THEM SEPERATOLY .

// public static int lcaDist(Node root , int n ){
//     //base case 
//     if(root == null){
//         return 0;
//     }
//     if(root.data == n ){
//         return 0;
//     }

//     //checking lca for both sides left asnd right
//     //imp step = store data left and right then 
//     //dist nikaLNE KE LIE STORE KRNA PDEGA 
//     int leftDist = lcaDist(root.left, n);
//     int rightDist = lcaDist(root.right , n); // crated a lcaDIST FUNCTION

//     //CHECKING KI VALUE H KHA HAI BHI YA NMHI 
//     if(leftDist == -1 && rightDist == -1){ // na to left me hjai na hi right m hai
//         return-1; 
//     }
//     elseif(leftDist == -1){
//         return rightDist+1;
//     }else{
//          return leftDist+1;
//         }
// }

// //MID SET KA FUNCTIONM 
// public static int minDist(Node root , int n1 , int n2){
//     Node lca = lca2(root ,n1,n2);
//     int dist1 = lcaDist(lca , n1);
//     int dist2 = lcaDist(lca, n2);
//     return dist1+dist2;
// }






// private static binaryTrees.Node lca2(binaryTrees.Node root, int n1, int n2) {
//     return null;
// }



//QUYE = KTH ANCESTOR OF A NODE
//procedure = ANCESTOR OF A NODE +1 NIKALENGE THEN PRINT KARALENGE 

public static int kAncestor(Node root , int n , int k){
    //root pr nhi mila toh 
    if(root == null){
        return -1;
    }//root pr nhi mila to
    if(root.data == n ){
        return 0;
    }
    //distance ki bakchodui h to we nned tp store them in left and right to 
    int leftDist = kAncestor(root.left, n, k);
    int rightDist = kAncestor(root.right, n, k);


    //checking existence right h ya left 
    if(leftDist == -1 && rightDist ==-1){
        return -1;
    }
    //ri8 nahi to left me sahi
    int max = Math.max(leftDist, rightDist);
    if(max + 1 == k){
        System.out.println(root.data);
    }
    return max +1;

}

//QUE = TRANSFORM INTOSUM TREES 
//sum tress = left + right = node // har  sub tree weather right or left
//APPROACH == ROOTDATA = ROOTLEFT + LEFT CHILD + ROOT.ROIGHT + RIGHT CHILD

public static int transform(Node root){
    //basecase 
    if(root == null){
        return 0;
    }
    int leftChild = transform(root.left);
    int rightChild = transform(root.right);
    int data = root.data;
    int newLeft = root.left == null?0: root.left.data;
    int newRight = root.right == null?0 : root.right.data;

    root.data = newLeft + leftChild + newRight + rightChild;
    return data;
}
public static void preorder(Node root){
    if(root == null){
        return;
    }
    System.out.println(root.data + " ");
    preorder(root.left);
    preorder(root.right);
}

public static void main(String args[]){
    //subnode
    /* 
    Node sUBRoot = new Node(2);
    sUBRoot.left = new Node(4);
    sUBRoot.right = new Node(5);*/
    

    //actuasl tree 


//     Node root = new Node(1);
//     root.left = new Node(2);
//     root.right = new Node(3);
//     root.left.left = new Node(4);
//     root.left.right = new Node(5);
//     root.right.left = new Node(6);
//     root.right.right = new Node(7);
//     // System.out.println(height(root));
//     // System.out.println(count(root));
//     // System.out.println(sum(root));
//     // System.out.println(diameter(root))
//    // System.out.println(diameter2(root));
//     //System.out.print(root,sUBRoot);
//     // System.out.println(height(root));
//     // int k = 2;
//     // KLevel(root, 1, k);
//     int  n  = 5; int k= 2;
//     //System.out.println(lca(root, n1, n2).data);
//     //System.out.println(minDist(root, n1, n2));
//     kAncestor(root, n, k);
//     transform(root);
//     preorder(root);

    
//     }
// }
 /* */
