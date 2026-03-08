package Dynamic_Programming;

public class Subset_Sum {
    public static void main(String[] args) {
        int[] arr = {8,5,2,4} ;
        int n = arr.length;
        int sum = 9 ;
        // i = 0 to n-1 | sum = sum to 0 .
        int[][] dp = new int[n][sum+1] ;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1 ;
            }
        }
        System.out.println(subset(0,sum,arr,dp));
    }

    private static boolean subset(int i, int sum, int[] arr,int[][] dp) {
        if(i== arr.length){
            if(sum==0) return true ;
            else return false ;
        }
        if(dp[i][sum]!= -1) return (dp[i][sum]==1) ;
        boolean ans = false ;
        boolean skip = subset(i+1,sum,arr,dp) ;
        if(sum-arr[i]<0){
            ans = skip ;
        } else{
            boolean pick = subset(i+1,sum-arr[i],arr,dp) ;
            ans = pick || skip ;
        }
        if (ans) dp[i][sum] = 1 ;
        else dp[i][sum] = 0 ;
        return  ans  ;
    }

}
