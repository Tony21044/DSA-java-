import java.util.Arrays;
public class dpPart6 {
    // Matrix Chain Multiplication (MCM)
    // Aim: To find the minimum cost after cross multiplication of the matrices
    // Recursive implementation

    // public static int mcm(int arr[], int i, int j) {
    //     // Base case
    //     if (i == j) {
    //         return 0;
    //     }

    //     // Condition loops
    //     int ans = Integer.MAX_VALUE; // Initialize to a large value
    //     for (int k = i + 1; k <= j; k++) { // Changed loop initialization
    //         int cost1 = mcm(arr, i, k - 1); // Updated function call
    //         int cost2 = mcm(arr, k, j); // Updated function call
    //         int cost3 = arr[i - 1] * arr[k - 1] * arr[j]; // Corrected array indices
    //         int finalCost = cost1 + cost2 + cost3;
    //         ans = Math.min(ans, finalCost);
    //     }
    //     return ans;
    // }

    //Tabulaton code for the mcm

    //Tablulation code 
  // public class Main {
    // public static int mcmTab(int arr[]) {
    //     int n = arr.length;
    //     int dp[][] = new int[n][n];

    //     // initialization
    //     for (int i = 0; i < n; i++) {
    //         dp[i][i] = 0;
    //     }

    //     // bottom-up filling
    //     for (int len = 2; len <= n - 1; len++) {
    //         for (int i = 1; i < n - len + 1; i++) {
    //             int j = i + len - 1;

    //             dp[i][j] = Integer.MAX_VALUE;

    //             for (int k = i; k <= j - 1; k++) { // Iterate over k to find the minimum cost
    //                 int cost1 = dp[i][k];
    //                 int cost2 = dp[k + 1][j];
    //                 int cost3 = arr[i - 1] * arr[k] * arr[j];
    //                 dp[i][j] = Math.min(dp[i][j], cost1 + cost2 + cost3);
    //             }
    //         }
    //     }
    //     print(dp);

    //     return dp[1][n - 1];
    // }

    // public static void print(int dp[][]) {
    //     for (int i = 0; i < dp.length; i++) {
    //         for (int j = 0; j < dp[0].length; j++) {
    //             System.out.print(dp[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    //QUE MINIMUM ARAY JUMP


//public class Main {
    public static int minJumps(int numbs[]) {
        int n = numbs.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        dp[n - 1] = 0; // last digit has to be zero

        for (int i = n - 2; i >= 0; i--) {
            int steps = numbs[i];
            int ans = Integer.MAX_VALUE;
            for (int j = i + 1; j <= i + steps && j < n; j++) {
                if (dp[j] != -1) {
                    ans = Math.min(ans, dp[j] + 1);
                }
            }
            if (ans != Integer.MAX_VALUE) {
                dp[i] = ans;
            }
        }
        return dp[0];
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 3 };
        System.out.println(minJumps(arr)); // Output: 2
    }
}
