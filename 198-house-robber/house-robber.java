class Solution {
    // public int rob(int[] nums) {
    //     int prev_rob=0,max_rob=0;
    //     for(int i=0;i<nums.length;i++) {
    //         int temp = Math.max(max_rob,prev_rob + nums[i]);
    //         prev_rob = max_rob;
    //         max_rob = temp;
    //     }
    //     return max_rob;

    // }

    //  public int rob(int[] nums) {
    //     int N = nums.length;
    //     if(N==1) return nums[0];
    //     int[] dp = new int[N];
    //     dp[0] = nums[0];
    //     dp[1] = Math.max(dp[0],nums[1]);
    //     for(int i=2;i<N;i++) {
    //         dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
    //     }
    //     return dp[N-1];
        
    // }

     public int rob(int[] nums) {
        int N = nums.length;
       int[] dp = new int[N];
       Arrays.fill(dp,-1);
       return robbing(nums,N-1,dp);
        
    }

    public int robbing(int[] nums, int index, int[] dp) {
        if(index < 0) return 0;
        if(dp[index] != -1) return dp[index];
        int nottake = robbing(nums,index-1,dp);
        int take = nums[index] + robbing(nums,index-2,dp);
        int ans = Math.max(take,nottake);
        dp[index] = ans;
        return ans;

    }

   
}