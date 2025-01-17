class Solution {
    public String longestCommonPrefix(String[] strs) {
        String minString = Arrays.stream(strs).min(Comparator.comparingInt(String::length)).orElse("");
        String result = minString;
        // String minString = strs[0];

        // for(int i = 1; i < strs.length; i++){
        //     if(minString.length() > strs[i].length()) {
        //         minString = strs[i];
        //     }
        // }

        // String result = minString;


        for(String str:strs) {
            for(int i= 0; i < result.length(); i++) {
                if(result.charAt(i)!= str.charAt(i)) {
                    result= result.substring(0, i);
                    break;
                }
            }
        }
        return result;

        
        
    }
}