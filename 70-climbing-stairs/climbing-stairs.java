class Solution {
    public int climbStairs(int n) {
        int[] st = new int[n+1];
        Arrays.fill(st,-1);
        return climb(n,st);
    }

    public int climb(int n,int[] st) {
        if(n == 0 || n==1) {st[n] = 1; return st[n];}
        if(st[n] !=-1) return st[n];
        st[n] = climb(n-1,st) + climb(n-2,st);
        return  st[n];
    }
}