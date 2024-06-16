class Solution {
    public int minAddToMakeValid(String s) {
        int openCount =0 ;
        int closeCount = 0;
        int operationCount = 0;

        for( int i= 0; i < s.length(); i++) {
            char ch  = s.charAt(i);
            if(ch == '(') openCount++;
            else {
                if(openCount > 0) {
                    openCount--;
                }else {
                    operationCount++;
                }

            }
            
        }
        if(openCount > 0) operationCount += openCount;
        return operationCount;

        
    }
}