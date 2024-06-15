class Solution {
    public int findPeakElement(int[] A) {

        int length = A.length;
        int start =0,end = length-1;
        int index = -1;
        while(start <= end) {
            int mid = start + (end- start)/2;
            if((mid ==0 || A[mid] > A[mid-1]) && (mid==length-1 || A[mid] > A[mid+1])) {
                return mid;
            }
            if(mid==0 || A[mid] > A[mid-1] ) start = mid+1;
            else end = mid-1;
    
        }
        return -1;
        
    }
}