/*import javax.sound.midi.Soundbank;

public class DP {
    // DYNAMIC PROGRAMMING: THIS IS A WAY OF FINDING AND SOLVING SOLUTIONS IN A MORE EFFECTIVE MANNER WITH LESS AND MORE STABLE TIME COMPLEXITY.

    // Find the nth Fibonacci number using dynamic programming.
    // We store the repetitions and reuse them when needed.
    public static int fib(int n, int[] f) {
        // Base case
        if (n == 0 || n == 1) {
            return n;
        }

        // Check if we have already computed the value of f(n)
        if (f[n] != 0) {
            return f[n];
        }

        // Compute f(n) recursively and store it in f
        f[n] = fib(n - 1, f) + fib(n - 2, f);
        return f[n];
    }

    //Tablutaion =
    //creating andoperation in table 
    public static int fibTabualation(int n ){
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i<  n;i++){
            dp[i] =dp[i-1] + dp[i-2];
        }
        return dp[n];  //return krna to jarurui jai bhaoio yad rkhjopo
        
    }
  
    //QUE 1 = CLIMBING STAIRS
    //-WE NEED TO FIND THE STEPS TO REACH THE NTH STATIRS WITH GIVEN NU OF STEPS 
    //TOTAL NU OF WAYS WE NEED TO FIND 
    //HUM N-1 AND N-2 TAK LOGIC LIKHLEGE THEN BS WE HAVE TO ADD 1 OR 2 TO REACH THE FIAL STAIRS 

    public static int countWays(int n ,int ways[]){
        //base case 
        if(n==0){
            return 1 ;

        }
        if(n<0){
            return -1; //steps

        }
         //this code is bullshit??
    // ans = due to its high time complexity whic leads it to the never ending time zone and loads of ereror 
    //TO OVERCOME THIS = WE GONA USE MEMMOIZQATION 
    //MEMOIZATION = WE GONNA MAKE A TBLE TO STORE THE UPPER LOADS OF THE UPPER DATA
    //TO SOTRE THE UPPER REPETETIONS OF THE PRERV DUE WHICH TIME CMOPLEXITY EXCEEDS

    //     //ways = IS already calcylated or duploicated or not
        if(ways[n] != -1){
            return ways[n];
        }
        return ways[n] = countWays(n-1,ways)  + countWays(n-2,ways);
    }

    //TABLUATION FORM FOR THIS QUESTION 
    // public static int countWaysTab(int n ){
        int dp[] = new int[n+1];
        dp[0] = 1;

        //tabulation
        for(int i = 1; i<=n; i++){
            if(i == 1){
                dp[i] = dp[i-1]+0;
            }else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }

    //QUE = KNAPSACK - A carrya bag
    //Trying to get a more stable/ suffoceont way to solve this question.

    //QUE = RECURSION MODE OF KNAPSACK PROBLEM 
    public static int knapSack(int val[] , int wt[] , int n , int w){
        //base case 
        if(w==0 || n == 0){
            return 0;
        }
        //recursion - condtion 
        if(w[n-1] <= w){  //wt == w[]
            //inc;iuded condtion
            int ans1 =  val[n-1]+knapSack(val, wt, w);
            //exlude condion 
            int ans2 = knapSack(val, wt, w);

        }
    }
    //Tabulation form continuation 
    //Proocess = make a table (arr) then store accordingly 
    public static int knapSack(int val[], int wt[], int w) {
        int n = val.length;
        int dp[][] = new int[n + 1][w + 1];
    
        // initialising base case by putting 0 
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }
    
        // nested loops for bottom-up approach and small to big problem 
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                int v = val[i - 1];
                int w1 = wt[i - 1];
                if (w1 <= j) { // valid condition
                    int incProfit = v + dp[i - 1][j - w1];
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else {
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
    
        return dp[n][w];
    }

    //MEMOIOIZATION OF THE CODE 
    //PROCEED = MEMORY ME REPETETIVE CHEZO KO SAVE KARNA HAI 
    //ARRAY BANAYEG EWITH THE RESPECT TO THE GIVEN CHAMGING VARRIABLES 
    //SAB ME -1(INVAID ) PUT KARDEHE THEN WE GONNA CHECK THE VALIDATION 
    public static int knapSack(int val[] , int w , int wt[] , int dp[][]){
        //basecase 
        if(w == 0 || n ==0){
            return 0;

        if(dp[n][w] != -1){
            return dp[n][w];
        }
        //condtiins valid // invalid 
        if(wt[n-1] <= w){
            //incluide 
            int ans1 = val[n-1] + knapSack(val, w, wt, dp);

            //exclude 
            int ans2 = knapSack(val, w, wt, dp);
            dp[w][n] = Math.max(ans1, ans2);
            return dp[n][w];
        }
        }

    }

    //QUE = TARGET SUM 
    //SIMMILAR AND DIFFER FROM KNPSACK 
    //PROCDUERE AND CODE ARE KINF OF SIMILAR T EACH OTHER 

    public static boolean targetSumSubset(int arr[], int sum) {
    int n = arr.length;
    boolean dp[][] = new boolean[n + 1][sum + 1];

    for (int i = 0; i < n + 1; i++) {
        dp[i][0] = true;
    }

    for (int i = 1; i < n + 1; i++) {
        for (int j = 1; j < sum + 1; j++) {
            int v = arr[i - 1];

            if (v <= j && dp[i - 1][j - v]) {
                dp[i][j] = true;
            } else if (dp[i - 1][j]) {
                dp[i][j] = true;
            }
        }
    }

    return dp[n][sum];
}
public static boolean targetSumSubset(int arr[], int sum) {
    int n = arr.length;
    boolean dp[][] = new boolean[n + 1][sum + 1];

    for (int i = 0; i < n + 1; i++) {
        dp[i][0] = true;
    }

    for (int i = 1; i < n + 1; i++) {
        for (int j = 1; j < sum + 1; j++) {
            int v = arr[i - 1];

            if (v <= j && dp[i - 1][j - v]) {
                dp[i][j] = true;
            } else if (dp[i - 1][j]) {
                dp[i][j] = true;
            }
        }
    }

    return dp[n][sum];
}
public static boolean targetSumSubset(int arr[], int sum) {
    int n = arr.length;
    boolean dp[][] = new boolean[n + 1][sum + 1];

    for (int i = 0; i < n + 1; i++) {
        dp[i][0] = true;
    }

    for (int i = 1; i < n + 1; i++) {
        for (int j = 1; j < sum + 1; j++) {
            int v = arr[i - 1];

            if (v <= j && dp[i - 1][j - v]) {
                dp[i][j] = true;
            } else if (dp[i - 1][j]) {
                dp[i][j] = true;
            }
        }
    }

    return dp[n][sum];
}
public static boolean targetSumSubset(int arr[], int sum) {
    int n = arr.length;
    boolean dp[][] = new boolean[n + 1][sum + 1];

    for (int i = 0; i < n + 1; i++) {
        dp[i][0] = true;
    }

    for (int i = 1; i < n + 1; i++) {
        for (int j = 1; j < sum + 1; j++) {
            int v = arr[i - 1];

            if (v <= j && dp[i - 1][j - v]) {
                dp[i][j] = true;
            } else if (dp[i - 1][j]) {
                dp[i][j] = true;
            }
        }
    }

    return dp[n][sum];
}
public static boolean targetSumSubset(int arr[], int sum) {
    int n = arr.length;
    boolean dp[][] = new boolean[n + 1][sum + 1];

    for (int i = 0; i < n + 1; i++) {
        dp[i][0] = true;
    }

    for (int i = 1; i < n + 1; i++) {
        for (int j = 1; j < sum + 1; j++) {
            int v = arr[i - 1];

            if (v <= j && dp[i - 1][j - v]) {
                dp[i][j] = true;
            } else if (dp[i - 1][j]) {
                dp[i][j] = true;
            }
        }
    }

    return dp[n][sum];
}
public static boolean targetSumSubset(int arr[], int sum) {
    int n = arr.length;
    boolean dp[][] = new boolean[n + 1][sum + 1];

    for (int i = 0; i < n + 1; i++) {
        dp[i][0] = true;
    }

    for (int i = 1; i < n + 1; i++) {
        for (int j = 1; j < sum + 1; j++) {
            int v = arr[i - 1];

            if (v <= j && dp[i - 1][j - v]) {
                dp[i][j] = true;
            } else if (dp[i - 1][j]) {
                dp[i][j] = true;
            }
        }
    }

    return dp[n][sum];
}
public static boolean targetSumSubset(int arr[], int sum) {
    int n = arr.length;
    boolean dp[][] = new boolean[n + 1][sum + 1];

    for (int i = 0; i < n + 1; i++) {
        dp[i][0] = true;
    }

    for (int i = 1; i < n + 1; i++) {
        for (int j = 1; j < sum + 1; j++) {
            int v = arr[i - 1];

            if (v <= j && dp[i - 1][j - v]) {
                dp[i][j] = true;
            } else if (dp[i - 1][j]) {
                dp[i][j] = true;
            }
        }
    }

    return dp[n][sum];

    //QUE = UNBOUNDED KNAOPSACJK 
    //THE MAIN DJKFFERENCE BETEWEEN THE UNBOUND AND FRACTIONAL IS WE CAN REUSE THINGS HER , UNLIKE THE FRACTIONAL ORR BOUNDED ON34.
    public static int unboundedKnapsack(int val[] , int wy[] , int W){
        int n = val.lenght;
        int dp[][] = new int[n+1][W+1];

        //putting 0 in i th bcz in java 0 aready theree witthout even putting 
        for(int  i = 0; i<n+!; i++){
            dp[i][0] = 0;
        }
        for(int j = 0 ; j<W+1 ; j++){
            dp[0][j] = 0;
        }
        //0-1 knapsack similar cocer right nopw wer are writinbg 
        //nested for loops we hgonna sue 
        for(int i = 1 ; i<n+1 ; i++){
            for(int j = 1 ; j<W+! ; j++){
                //checking validation 
                if(wt[i-1] <= j){
                    return dp[i][j] = Math.max(val(i-1)+ dp[i][j-wt(i-1)], dp[i-1][j]);

                }else{//inmbalid exclude condtyion 
                    dp[i][j] = dp[i-1][j];

                }
                 
            }
        }
        return dp[n][W]; //last cell of the 3 d array we have made for ther data trp get enters 


    }
}

// QUE = COIN CHANGE -
//STATEMENT = GIVEN COIN HONGE THEN WE NEED TO FINFD THE TOTAL SUM BY USING THE COINS AGAIN , AGAIN ETX THASTSD WHY WE GOT TO KNOW THAT THIS IS A QUE OF UNBOUD ED KNAPSCK , AND THE MAJAOR CRUX IN THIS QUEWSTION IS THE DP][][] = I WHERE THE ARRAY OF COIN ]][[ ] == I-1 , AND ONE MORE THING IS WE GONNA n(i-1) = i is excluded , i ko chod lkr  

public static int coinChange(int coins[] , int sum[]){
    int n = coins.length;
    int dp[][] = new int[n+][sum+1];
    //initialIZATION
    //X AZXIS = 0'
    //Y AXIS = 1`
    
    for(int i = 0 ; i<n+1 ; i++){
        dp[i][0] = 1;       
}
for(int j=1 ; j<sum+1 ; j++){
    dp[0][j] = 0;

}
for(int i = 1;i<n+1; i++){
    for(int j = 1; j<sum+1; j++){
        //validation condtiton 
        //size ke basis parr
        if(coins[i-1] <= j){
            dp[i][j] = dp[i][j-coins[i-1] + dp[i-1][j]];
        }else{
            dp[i][j] = dp[i-1][j];
        }
    }
}
return dp[n][sum];
}
 public static void main(String[] args) {
    int coins[] = (1,2,3);
    int sum = 4;
    System.out.println(coinChange(coins, coins));
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        //int arr[]= {4,3,7,1,3};
        //int sum = 10;
        // int val[] = {15,14,10,45,30};
        // int wt[] = {2,5,1,3,4};
        // int w= 7;
        // int n = 5;
        // int[] f = new int[n + 1];
        // System.out.println(fib(n, f));
      //  System.out.println(countWays(n));
        // System.out.println(countWays(n, f));
        // countWaysTab(n);
        // System.out.println(knapSack(f, f, n));
        // System.out.println(knapSack(f, f, n, n));
        // System.out.println(knapSack(val, w, wt, null));
        System.out.println(targetSumSubset(arr, sum));
        System.out.println(unboundedKnapsack(val, wt, W));
        
        
    }
     System.out.println(targetSumSubset(arr, sum));
        System.out.println(unboundedKnapsack(val, wt, W));

