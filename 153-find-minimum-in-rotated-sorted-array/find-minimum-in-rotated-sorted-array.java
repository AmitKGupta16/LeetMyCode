class Solution {
    public int findMin(int[] nums) {
       // if(nums.length ==1) return 0;
        if(nums.length ==1 || (nums[0] < nums[nums.length-1])) return nums[0];

        int start =0 ,end = nums.length-1, ans =0;
        while(start <= end) {
            int mid = start+ (end- start)/2;
            if(nums[mid] >= nums[0]) start = mid+1;
            else {
                ans = nums[mid];
                end = mid-1;
            }
        }
        return ans;



        
    }
}