class Solution {
    public int removeDuplicates(int[] nums) {

        int start =0 , index =0;
        while(index < nums.length) {
            if(nums[start] != nums[index]) {
                nums[++start] = nums[index];
            }
            index++;
        }
        return start+1;

        
    }
}