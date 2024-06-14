class Solution {
    public int search(int[] A, int target) {
        int length = A.length;
        if(length ==0) return -1;
        if(length ==1 ) {
            if(A[0]==target) return 0;
            else return -1;
        }
        int start =0,end= length-1;

        while(start <= end) {
            int mid = start + (end - start)/2;
            
            if(A[mid]== target) return mid;

            if(A[start] <= A[mid]) {

                if(A[start] <= target && target < A[mid]) {
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }else {
                if(A[end] >= target && target > A[mid]) {
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
           
        }

        return -1; 
    }
}