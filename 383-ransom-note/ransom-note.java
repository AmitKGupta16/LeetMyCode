class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] visited = new int[26];
        for(int i=0;i<ransomNote.length();i++) {
            visited[ransomNote.charAt(i)-'a']++;
        }
        for(int i=0;i<magazine.length();i++) {
            visited[magazine.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++) {
            if(visited[i] > 0) return false;
        }
        return true;
        
    }
}