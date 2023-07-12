import java.util.*;
public class DP3 {
    
    // que = LONGEST COMMON SUBSTRING
    // SAME AS PREV BUT THE ONLY CHANGE IN THE CASE2 WHEN THE LAST DIGITS ARE NOT EQUAL
    public static int longestCommonSubstring(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        int ans = 0;

        // initialization case of ROW AND COL == 0;
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < m + 1; j++) {
            dp[0][j] = 0;
        }

        // bottoms up condition
        // same case
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }

    //QUE 2 = LOONGEST INCFRESSUG DUBXEQUENCE 
    //SAN=ME S PREEV = AN ARRAY SHOULKD BE GIVEN TO USE WE NEED TO UDER HASSH MAO THN SORT ASRRAY AND STORE IN A  HASSHMAP THREN PERFORM LCS ON BOTH STR1 , STR2 THRN WE GET OUR ANSWER
    public static int lcs(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < m + 1; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (arr1(i - 1) == arr2(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    
                } else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);


                    
                }
            }
        }
        return dp[i][j];
}


    public static int lis(int arr[]){
        //hashset bana rahe hai
        HashSet<Integer> set = new HashSet<>(0);
        for(int i =0 ; i<arr1.length;i++){
            set.add(arr1[i]);
        }

        //hashset me dal rhe hai elements 
        int arr2[] = new int[set.size()];
        int i = 0;
        for (int num : set) {
            arr2[i] = num;
            i++;
            
        }
        //sorting in ascending 
        Arrays.sort(arr2);
        return lcs(arr1 , arr2);

    }
    //QUE 3 = EDIT DISTANCE = THE PROCEESS OF CONVERSION O F OE STRINTG INTO ANOTHER STRING WITH TH HELP OF GIVEN OPERATIONS WHICH HAS TO  BE USED IN MINIMUMN WAY OR COUNT
    code 
    public static int editDistance(String str1 , String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];

        //initialize i == 0 , j== 0
        for(int i = 0;i<n+1;i++){
            for(int j = 0; j<m+1 ; j++){
                if(i == 0){
                    dp[i][j] == j;

                }if{
                    dp[i][j] == i;
                }
            }
        }
        //problem slving BOTTOM UP
        //SAME VALIO OR DIFFERENT BALI CONDITION
        for(int i=1;i<n+1;i++){
            for(int j =1;j<m+1;j++){
                if(str1.charAt(i-1) == str2.charAt(i-1)){
                    dp[i][j] = dp[i-1][j-1];

                }else{
                    //where char are different
                    int add = dp[i][j-1]+1;
                    int remove = dp[i-1][j]+1;
                    int replace = dp[i-1][j-1]+1;
                    dp[i][j] = Math.min(add, Math.min(replace ,remove));

                }
            }
        }
        return dp[n][m];
    }


    public static void main(String args[]) {
        String word1 = "intention";
        String word2 = "execution";

        // String str1 = "ABCDEW";
        // String str2 = "ABCDE";
        System.out.println(longestCommonSubstring(str1, str2));
        System.out.println(editDistance(word1, word2));
    }
}




