public class DPpart5 {
    // Question 1 = WILDCARD MATCHING
    // Difficulty level = Hard
    // We need to match the given string and pattern and two signs are also given
    public static boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();

        // Making array
        boolean[][] dp = new boolean[n + 1][m + 1];
        // Initializing
        dp[0][0] = true;
        // If pattern is empty
        for (int i = 1; i < n + 1; i++) {
            dp[i][0] = false;
        }
        // Where our string is empty and pattern is there
        for (int j = 1; j < m + 1; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];

            }
        }
        // Bottom-up code
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                // Case 1: when i-1 = j-1 then what is the jth term
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    // Case 2: when the last(jth) term is equal to the star *
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }

    //QUE2 = CATALANS'S nUMBER 
    //Difficulty level = Hard
    //PROCES = KINDA SIMILAR TO FIBONACCCI NUMBERS
    public static int catalanRec(int n ){
        //base casse 
        if(n==0 || n==1){
            return n;
        }
        //recursive case
        int ans = 0;
        for(int i = 0; i<=n-1; i++){
            ans += catalanRec(i) * catalanRec(n-i-1);
        }
        return ans;


    }

    //memoisation 
    public static int CatalanMemo(int n , int dp[]){
        //base case 
        if(n == 0  || n==1){
            return dp[n];
        }
        //recursion phase started we ghoonna use eturn statement to taske exiit from this
        int ans = 0;
        for(int i = 0;i<n;i++){
            ans+=CatalanMemo(i, dp) + CatalanMemo(n-i-1, dp);
        }
        return dp[n] = ans;
    }

    //tabulation form 
    public static int CatalanTab(int n ){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2 ; i<=n;i++){
            for(int j = 0;j<1;j++){
                dp[i] += dp[j] + dp[i-j-1];
            }
        }
        return dp[n];

    }

    //QUE = COUNT BST 
    public static int countBST(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i<n+1 ;i++){
            for(int j = 0;j<i ;j++){
                int left = dp[j];
                int right = dp[i-j-1];
                dp[i] += left*right;

            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        // System.out.println(catalanRec(n));
        System.out.println(countBST(n));
        // int dp[] = new int[n+1];
        // Array.fill(dp-1);
        // System.out.println(CatalanMemo(n, dp));
        // System.out.println(CatalanTab(n=5));
        // String s = "baaabab";
        // String p = "****ba*****ab";
        // System.out.println(isMatch(s, p));

        // //pritns ans2 
        // int n = 5;
        // System.out.println(catalanRec(n));


    }
}



