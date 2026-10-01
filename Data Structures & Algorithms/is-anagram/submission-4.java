class Solution {
    public boolean isAnagram(String s, String t) {

        if( s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> strS = new HashMap<>();
        HashMap<Character,Integer> strT = new HashMap<>();

        for(int i = 0; i< s.length(); i++){
            //puts the char in th emap
            strS.put(s.charAt(i), strS.getOrDefault(s.charAt(i), 0) +1);
            strT.put(t.charAt(i), strT.getOrDefault(t.charAt(i), 0) +1);
        }

        return strS.equals(strT);







    }
}
