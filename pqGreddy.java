// import java.rmi.server.SocketSecurityException;
// import java.util.*;
// public class pqGreddy {
    //QUE 1 = //Maximum vbalaNCING STRING PARTIONING 
//      static int balancedPartitioned(String str , int n){
//         //base condition 
//         if(n == 0){
//             return 0;
//         }
//         int r = 0 ,  l = 0;
//         int ans  = 0;
//         for(int i = 0;i<n;i++){
//             if(str.charAt(i) == 'R'){
//                 r++;
//             }
//              else if(str.charAt(i) == 'L'){
//             l++;
//         }
//         if(r == l){
//             ans++;
//         }    
//     }
//         public static void main(String args[]){
//             String str = "LLRRRRLLRRL";
//             int n = str.length();
        
//         System.out.print(balancedPartitioned(str, n) + "\n");
//     }
// }

// Java implementation for the above approach


	// Function to return Kth largest
	// odd number if it exists
	// public static int kthOdd(int[] range, int K) {

	// 	// Base Case
	// 	if (K <= 0)
	// 		return 0;

	// 	int L = range[0];
	// 	int R = range[1];

	// 	if ((R & 1) > 0) {

	// 		// Calculate count of odd
	// 		// numbers within the range
	// 		int Count = (int) Math.ceil((R - L + 1) / 2);

	// 		// if k > range then kth largest
	// 		// odd number is not in the range
	// 		if (K > Count)
	// 			return 0;

	// 		else
	// 			return (R - 2 * K + 2);
	// 	} else {

	// 		// Calculate count of odd
	// 		// numbers within the range
	// 		int Count = (R - L + 1) / 2;

	// 		// If k > range then kth largest
	// 		// odd number is not in this range
	// 		if (K > Count)
	// 			return 0;

	// 		else
	// 			return (R - 2 * K + 1);
	// 	}
	// }

	// // Driver Code
	// public static void main(String args[])
	// {
	
	// 	// Initialize the range
	// 	int[] p = { -10, 10 };

	// 	// Initialize k
	// 	int k = 8;

	// 	// print the kth odd number
	// 	System.out.println(kthOdd(p, k));
	// }

    // QUE 3 =lEXICOGRAPHICALY ORDER = aLPHABETICALLY ORDER WHEREE a is smallest asnd z is biggest ever existed in the alphbeticlly tqble 
    //lexicographic k th smallest order 
   
    
    //QUE 4 = BEST TIME TO BUY AND SELL STOCKS

    
    

    



