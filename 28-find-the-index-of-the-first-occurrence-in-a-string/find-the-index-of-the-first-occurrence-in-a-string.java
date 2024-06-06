class Solution {
    public int strStr(String haystack, String needle) {
         int totalLength = haystack.length();
        int length = needle.length();
        for(int i=0;i<=totalLength-length;i++) {
            int count =0;
            for(int j=0;j< length;j++) {
                if(haystack.charAt(i+j)== needle.charAt(j)) {
                    count++;

                }
            }
            if(count ==length) return i;
        }
        return -1;
    }
}