class Solution {
    public static int fun(int n,int[] arr){
        if(n==0||n==1){
            return 1;
        }
        if(arr[n]!=0) return arr[n];
        int left=fun(n-1,arr);
        int right=fun(n-2,arr);
        arr[n]=left+right;
        return arr[n];
    }
    public int climbStairs(int n) {
     int dp[]=new int[n+1];
    return  fun(n,dp);    
    }
}