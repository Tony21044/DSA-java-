import java.util.concurrent.locks.LockSupport;

public class DP2 {
    public static int rodCutting(int[] length, int[] price, int totRod) {
        int n = length.length;
        int[][] dp = new int[n+1][totRod+1]; 

        // Base case
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= totRod; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        // DP loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= totRod; j++) {
                if (length[i-1] <= j) {
                    dp[i][j] = Math.max(price[i-1] + dp[i][j-length[i-1]], dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][totRod];
    

    //QUE 2 = LONGEST COMMON SUBSEQUENCE 
    //WE NEED TO FINFG THE COMMON STRING AKLPHAS, FROM THE ACTRUAL GIVEN A=STRING AND FIND THE COUNT ++
    public static int lcs(String str1, String str2, int n, int m) {
        // base case
        if (n == 0 || m == 0) {
            return 0;
        }
        // recursive cases
        if (str1.charAt(n-1) == str2.charAt(m-1)) {
            // if last characters of both strings are same,
            // include it in LCS and recur for remaining lengths
            return 1 + lcs(str1, str2, n-1, m-1);
        } else {
            // if last characters are not same, 
            // recur for remaining lengths of both strings
            int ans1 = lcs(str1, str2, n, m-1);
            int ans2 = lcs(str1, str2, n-1, m);
            return Math.max(ans1, ans2);
        }
    }


    //Memoization conversion of the Code
    // the process of storingthe losds of repetetyion in an array, ehre the arrays can be 1-D or 2-D  ,as depends on varribles given,

    

    public static int lcs2(String str1, String str2, int n, int m,int dp[][]) {
        // base case
        if (n == 0 || m == 0) {
            return 0;
        }

        //checing it is already calculated or not , ARRAY CHECK LIST 
        if(dp[n][m] != -1){
            return dp[n][m];
        }
        // recursive cases
        if (str1.charAt(n-1) == str2.charAt(m-1)) {
            // if last characters of both strings are same,
            // include it in LCS and recur for remaining lengths
            return 1 + lcs(str1, str2, n-1, m-1);
        } else {
            // if last characters are not same, 
            // recur for remaining lengths of both strings
            int ans1 = lcs2(str1, str2, n, m-1,int dp);
            int ans2 = lcs2(str1, str2, n-1, m,int dp);
            return Math.max(ans1, ans2);
        }
    }

    //QUE 3 = TABULATOION FORM OF THE SAME CODE 
    public static int lcsTab(String str1 , String str2){
        int n = str1.lenghth();
        int n = str2.lenght();
        //MAKING DP

        int dp[][] = new int[n+1][m+1];
        //nested law
        for(int i = 0; i<n+1 ; i++){
            for(int j = 0; j<m+1 ; j++){
                //base case - initilization of recursion base 
                if(i==0 || j == 0){
                    dp[i][j] == 0;

                }
            }

        }
        for(int i = 1;i<n+1;i++){
            for(int j = 1; j<m+1;j++){
                //SAME I-1 TH ELEMENT OF THE BOTH STRS 
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1; //same conditioon

                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1,ans2);
                }

            }
        }
        return dp[n][m];


    }
    //output will be the same but with the better and diferent complexity 

    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg";
        System.out.println(lcsTab);
        // int n  = str1.length();
        // int m = str2.length();
        // int dp[][] = new int[n+1][m+1];
        // //INITILAIZING 0
        // for(int i = 0; i<n+1;i++){
        //     for(int j = 0;j<m+!;j++){
        //         dp[i][j] = -1;
        //     }
        // }


        // int n = str1.length();
        System.out.println(lcs2(str1, str2, n, n,dp));
    
    }
}
}