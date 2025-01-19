class Solution {
    public boolean isPalindrome(String A) {
        A =  A.toLowerCase();
        int start = 0,end = A.length()-1;

        while(start < end) {
            if(!Character.isDigit(A.charAt(start)) && !Character.isAlphabetic(A.charAt(start))) {
                start++;
                continue;
            }
            if(!Character.isDigit(A.charAt(end)) && !Character.isAlphabetic(A.charAt(end))) {
               end--;
               continue;
            }
            if(A.charAt(start) != A.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
        
    }
}