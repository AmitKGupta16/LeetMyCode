class Solution {
    public void moveZeroes(int[] nums) {
        // int nonZeroPointer = 0;
        // for(int i = 0;i< nums.length;i++) {
        //     if(nums[i] !=0) {
        //         nums[nonZeroPointer++] = nums[i];
        //     }
        // }

        // for(int i = nonZeroPointer ; i<nums.length;i++ ) {
        //     nums[i] =0;
        // }

        int start =0;
        int end = 1;
        while (end < nums.length) {
            if(nums[start] ==0 && nums[end] !=0) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;end++;
            } else if(nums[start] ==0 && nums[end] ==0){
                end++;
            }else if(nums[start] != 0) {
                start++;end++;
            }
        }
    
    }
}