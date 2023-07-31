public class DP2 {

    // Rod Cutting Problem
    public static int rodCutting(int[] length, int[] price, int totRod) {
        int n = length.length;
        int[][] dp = new int[n + 1][totRod + 1];

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
                if (length[i - 1] <= j) {
                    dp[i][j] = Math.max(price[i - 1] + dp[i][j - length[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][totRod];
    }

    // Longest Common Subsequence (Recursive)
    public static int lcs(String str1, String str2, int n, int m) {
        // Base case
        if (n == 0 || m == 0) {
            return 0;
        }
        // Recursive cases
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            // If last characters of both strings are the same,
            // include it in LCS and recur for remaining lengths
            return 1 + lcs(str1, str2, n - 1, m - 1);
        } else {
            // If last characters are not the same,
            // recur for remaining lengths of both strings
            int ans1 = lcs(str1, str2, n, m - 1);
            int ans2 = lcs(str1, str2, n - 1, m);
            return Math.max(ans1, ans2);
        }
    }

    // Longest Common Subsequence (Memoization)
    public static int lcs2(String str1, String str2, int n, int m, int[][] dp) {
        // Base case
        if (n == 0 || m == 0) {
            return 0;
        }

        // Checking if it is already calculated or not (Memoization)
        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        // Recursive cases
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            // If last characters of both strings are the same,
            // include it in LCS and recur for remaining lengths
            dp[n][m] = 1 + lcs2(str1, str2, n - 1, m - 1, dp);
        } else {
            // If last characters are not the same,
            // recur for remaining lengths of both strings
            int ans1 = lcs2(str1, str2, n, m - 1, dp);
            int ans2 = lcs2(str1, str2, n - 1, m, dp);
            dp[n][m] = Math.max(ans1, ans2);
        }
        return dp[n][m];
    }

    // Longest Common Subsequence (Tabulation)
    public static int lcsTab(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        // DP table
        int dp[][] = new int[n + 1][m + 1];

        // Base case - initialization of recursion base
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    // If characters are the same, include it in LCS
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // Characters are different, recur for remaining lengths
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        // Rod Cutting Problem
        int[] length = {1, 2, 3, 4};
        int[] price = {2, 5, 7, 8};
        int totRod = 5;
        System.out.println("Max Price: " + rodCutting(length, price, totRod));

        // Longest Common Subsequence
        String str1 = "abcdge";
        String str2 = "abedg";
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        // Initialize dp array with -1 for Memoization
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println("Length of LCS (Recursive): " + lcs(str1, str2, n, m));
        System.out.println("Length of LCS (Memoization): " + lcs2(str1, str2, n, m, dp));
        System.out.println("Length of LCS (Tabulation): " + lcsTab(str1, str2));
    }
}
