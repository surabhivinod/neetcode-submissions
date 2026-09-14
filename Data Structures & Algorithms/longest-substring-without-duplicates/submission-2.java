class Solution {
    public int lengthOfLongestSubstring(String s) {

    HashSet<Character> charSet = new HashSet<>();
    int left = 0;
    int result = 0;

    for(int r = 0; r < s.length(); r++){
        //case it finds a duplicate
        while(charSet.contains(s.charAt(r))){
            charSet.remove(s.charAt(left));
            left++;
        }

        charSet.add(s.charAt(r));
        result = Math.max(result,r-left+1);
    }
    return result;
        
        
    }
}
