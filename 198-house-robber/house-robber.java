class Solution {
    public int rob(int[] nums) {
        int prev_rob=0,max_rob=0;
        for(int i=0;i<nums.length;i++) {
            int temp = Math.max(max_rob,prev_rob + nums[i]);
            prev_rob = max_rob;
            max_rob = temp;
        }
        return max_rob;

    }

   
}