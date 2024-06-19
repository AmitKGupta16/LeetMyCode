class Solution {
    public int trap(int[] height) {
        int length = height.length;
        int ans =0;
        int[] leftMax = new int[length];
        int[] rightMax = new int[length];
        leftMax[0] =0;
        rightMax[length-1] =0;
        for(int i=1;i<length;i++) {
            leftMax[i] = Math.max(leftMax[i-1],height[i-1]);
        }
        for(int i=length-2;i>=0;i--) {
            rightMax[i] = Math.max(rightMax[i+1],height[i+1]);
        }

        for(int i=1;i<length-1;i++) {
            int water = Math.min(leftMax[i],rightMax[i]) - height[i];
            if(water > 0) ans += water;
        }
        return ans;
        
    }
}