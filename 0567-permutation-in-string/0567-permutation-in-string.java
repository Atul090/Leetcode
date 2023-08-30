class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] data=new int[26];
        int[] test=new int[26];
        for(char c:s1.toCharArray())data[c-'a']++;
        for(int i=0;i<s2.length();i++){
            test[s2.charAt(i)-'a']++;
            if(i>=s1.length())test[s2.charAt(i-s1.length())-'a']--;
            if(Arrays.equals(test,data))return true;
        }
        return false;
    }
}
/*
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false; // s1 is longer, so s2 can't have a permutation of s1
        }
        
        // Count how many times each letter appears in s1
        Map<Character, Integer> letterCounts = new HashMap<>();
        for (char c : s1.toCharArray()) {
            letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
        }
        
        int left = 0;
        int right = 0;
        int remainingChars = s1.length();
        
        while (right < s2.length()) {
            char rightChar = s2.charAt(right);
            
            // If the current letter is in s1, adjust the count
            if (letterCounts.containsKey(rightChar)) {
                int count = letterCounts.get(rightChar);
                if (count > 0) {
                    remainingChars--; // Found one needed character
                }
                letterCounts.put(rightChar, count - 1);
            }
            
            // Move the window and adjust counts
            if (right - left + 1 > s1.length()) {
                char leftChar = s2.charAt(left);
                if (letterCounts.containsKey(leftChar)) {
                    int count = letterCounts.get(leftChar);
                    if (count >= 0) {
                        remainingChars++; // Undo a character's count
                    }
                    letterCounts.put(leftChar, count + 1);
                }
                left++; // Move the left side of the window
            }
            
            // If we found a valid permutation, return true
            if (remainingChars == 0) {
                return true;
            }
            
            right++; // Move the right side of the window
        }
        
        return false; // No valid permutation found
    }
}
*/