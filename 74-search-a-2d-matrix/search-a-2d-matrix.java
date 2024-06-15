class Solution {
    public boolean searchMatrix(int[][] A, int target) {
        int N = A.length;
        int M = A[0].length;
        int start = 0, end = M-1;
        while(start < N && end >=0) {
            if(A[start][end] == target) return true;
            if(target < A[start][end]) end--;
            else start ++;
        }
        return false;
    }
}