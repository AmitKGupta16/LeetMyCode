class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] res=  new int[2];
        // boolean temp;
        // for(int i =0 ; i<nums.length; i++) {
        //     for (int j= i+1; j< nums.length ; j++) {
        //         temp = (nums[i] + nums[j]) == target ? true :false;
        //         if(temp) {
        //             res[0] = i;
        //             res[1] = j;
        //         }
        //     }
        // }
        // return res;

        //  int[] res = new int[2];
        // for(int i=0;i<nums.length;i++) {
        //     for(int j=i+1;j<nums.length;j++) {
        //         if((nums[i] + nums[j]) == target) {
        //             res[0] = i;
        //             res[1] = j;
        //         }
        //     }
        // }
        // return res;
        // int[] res = new int[2];
        // for(int i=0;i<nums.length-1;i++) {
        //     if((nums[i] + nums[i+1]) == target) {
        //         res[0] = i;
        //         res[1] = i+1;
        //     }

        // }
        // return res;
                int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++) {
        //     if(map.containsKey(target - nums[i])) {
        //         res[0] = i;
        //         res[1] = map.get(target - nums[i]);
        //         return res;

        //     }
        //     map.put(nums[i],i);
        // }
        // return res;

    //    int[] output = new int[2];
    //     for(int i=0;i<nums.length;i++) {
    //         for(int j= i+1;j<nums.length;j++) {
    //             if(nums[i]+nums[j] == target) {
    //                 output[0] = i;
    //                 output[1] = j;
    //             }
    //         }
    //     }
    //     return output;

        int[] output = new int[2];
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(map1.containsKey(target - nums[i])) {
                output[0] = map1.get(target - nums[i]);
                output[1] = i;
            }
            map1.put(nums[i],i);
        }
        return output;
 
    }
}